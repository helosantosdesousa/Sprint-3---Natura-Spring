package br.com.fiap.naturaspring.domain.topico;

import br.com.fiap.naturaspring.connection.ConnectionFactory;
import br.com.fiap.naturaspring.domain.post.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TopicoDAO {
    private ConnectionFactory connection;
    public TopicoDAO(){
        this.connection = new ConnectionFactory();
    }

    //Criar um novo tópico
    public void criarTopico(Topico topico) {

        String sql = "INSERT INTO NATURA_TOPICO(id_topico, titulo_topico)"
                + "VALUES(?,?)";

        Connection conn = connection.recuperaConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, topico.getId_topico());
            ps.setString(2, topico.getTitulo());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
