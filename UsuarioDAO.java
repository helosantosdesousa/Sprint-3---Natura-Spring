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

        String sql = "INSERT INTO NATURA_USUARIOS(cpf, username, email, nivel_natura)"
                + "VALUES(?,?,?,?)";

        Connection conn = connection.recuperaConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, usuario.getCpf());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getNivel_natura());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //pesquisar username
    public Usuario pesquisarUsername(String username) {
        Usuario usuario = null;

        String sql = "select * from natura_usuario where username = ?";

        Connection conn = connection.recuperaConexao();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                usuario = new Usuario(rs.getString("cpf"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("nivel_natura"));
            }
        } catch (SQLException e) {
            System.out.println("erro ao pesquisar o usuario\n" + e);

        }
        return usuario;
    }
    public void atualizar (Usuario usuario) {
        Connection conn = connection.recuperaConexao();
        String sql = "update natura_usuario set cpf = ? where username = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getCpf());
            ps.setString(2, usuario.getUsername());

            ps.execute();
        } catch (SQLException e) {
            System.out.println("erro ao atualizar dados do usuário\n" + e);
        }
    }
    public void apagarConta (String username)  {
        Connection conn = connection.recuperaConexao();

        String sql = "DELETE FROM natura_usuario WHERE username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.execute();
        } catch (SQLException e) {
            System.out.println("erro ao deletar username do usuário\n" + e);
        }
    }

    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<Usuario>();
        Connection conn = connection.recuperaConexao();
        String sql = "select * from natura_usuarios";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                lista.add(new Usuario(rs.getString("cpf"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("nivel_natura")
                        ));
            }
        } catch (SQLException e) {
            System.out.println("erro ao listar usuários\n" + e);
        }

        return lista;
    }


}