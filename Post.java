package br.com.fiap.naturaspring.domain.post;

import java.time.LocalDate;

public class Post {
    private int id_post;
    private String conteudo_post;
    private LocalDate data_post;

    public Post(int id_post, String conteudo_post, LocalDate data_post) {
        super();
        this.id_post = id_post;
        this.conteudo_post = conteudo_post;
        this.data_post = data_post;
    }


    @Override
    public String toString() {
        return id_post + " -- " + conteudo_post + " -- " + data_post;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getConteudo_post() {
        return conteudo_post;
    }

    public void setConteudo_post(String conteudo_post) {
        this.conteudo_post = conteudo_post;
    }

    public LocalDate getData_post() {
        return data_post;
    }

    public void setData_post(LocalDate data_post) {
        this.data_post = data_post;
    }
}
