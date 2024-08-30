package br.com.fiap.naturaspring.domain.post;

public class Post {
    private int id_post;
    private String conteudo_post;

    public Post(int id_post, String conteudo_post) {
        super();
        this.id_post = id_post;
        this.conteudo_post = conteudo_post;
    }

    public Post(int id_post) {
        super();
        this.id_post = id_post;
    }

    public Post(String conteudo_post) {
        super();
        this.conteudo_post = conteudo_post;
    }

    @Override
    public String toString() {
        return id_post + " -- " + conteudo_post;
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
}
