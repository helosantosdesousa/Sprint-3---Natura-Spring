package br.com.fiap.naturaspring.domain.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.naturaspring.connection.ConnectionFactory;

public class UsuarioDAO {
    static private ConnectionFactory connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory();
    }

    //Criar uma nova conta
    public void criarConta(Usuario usuario) {

        String sql = "INSERT INTO NATURA_USUARIO(username, cpf)"
                + "VALUES(?,?)";

        Connection conn = connection.recuperaConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, usuario.getUsername());
            ps.setInt(2, usuario.getCpf());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //pesquisar username
    /*public Usuario pesquisarUsername(String username) {
        Usuario usuario = null;
        String sql = "select * from natura_usuario where username = ?";
        try {
            Connection conn = connection.recuperaConexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    usuario = new Usuario(rs.getInt("cpf", rs.getString("username")));
                }
            } catch (SQLException e){
                System.out.println("Erro ao pesquisar o usuário\n" + e);
            }
            return usuario;
    }

    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<Usuario>();
        Connection conn = connection.recuperaConexao();
        sql = "select * from natura_usuario";
        try {
            conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Usuario(rs.getInt("cpf"), rs.getString("username")));
            }
        } catch (SQLException e) {
            System.out.println("erro ao listar os usuários\n" + e);
        }

        return lista;
    }*/
}