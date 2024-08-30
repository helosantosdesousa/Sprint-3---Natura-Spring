package br.com.fiap.naturaspring.domain.topico;

import br.com.fiap.naturaspring.connection.ConnectionFactory;
import br.com.fiap.naturaspring.domain.post.Post;
import br.com.fiap.naturaspring.domain.usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicoDAO {
    private ConnectionFactory connection;
    public TopicoDAO(){
        this.connection = new ConnectionFactory();
    }

    //Criar um novo tópico
    public void criarTopico(Topico topico) {

        String sql = "INSERT INTO NATURA_TOPICOS (id_topico, titulo, categoria) " +
                "VALUES (?, ?, ?)";


        Connection conn = connection.recuperaConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, topico.getId_topico());
            ps.setString(2, topico.getTitulo());
            ps.setString(3, topico.getCategoria());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Listar tópicos
    public List<Topico> listar() {
        List<Topico> lista = new ArrayList<Topico>();
        Connection conn = connection.recuperaConexao();
        String sql = "select * from natura_topicos";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                lista.add(new Topico(rs.getInt("id_topico"),
                        rs.getString("titulo"),
                        rs.getString("categoria")
                ));
            }
        } catch (SQLException e) {
            System.out.println("erro ao listar tópicos\n" + e);
        }

        return lista;
    }

    //Pesquisar tópicos
    public Topico pesquisarTopico(int id_topico) {
        Topico topico = null;

        String sql = "select * from natura_topicos where id_topico = ?";

        Connection conn = connection.recuperaConexao();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_topico);

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                topico = new Topico(rs.getInt("id_topico"),
                        rs.getString("titulo"),
                        rs.getString("categoria"));
            }
        } catch (SQLException e) {
            System.out.println("erro ao pesquisar o tópico\n" + e);

        }
        return topico;
    }

}
