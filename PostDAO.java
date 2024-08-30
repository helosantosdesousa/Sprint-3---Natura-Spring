package br.com.fiap.naturaspring.domain.post;

import br.com.fiap.naturaspring.connection.ConnectionFactory;
import br.com.fiap.naturaspring.domain.usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDAO {
    private ConnectionFactory connection;
    public PostDAO(){
        this.connection = new ConnectionFactory();
    }

    //Criar um novo post
    public void criarPost(Post post) {

        String sql = "INSERT INTO NATURA_POST(id_post, conteudo_post)"
                + "VALUES(?,?)";

        Connection conn = connection.recuperaConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, post.getId_post());
            ps.setString(2, post.getConteudo_post());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
