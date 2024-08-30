package br.com.fiap.naturaspring.domain.topico;

public class Topico {
    private int id_topico;
    private String titulo;
    private String categoria;

    public Topico(int id_topico, String titulo, String categoria) {
        super();
        this.id_topico = id_topico;
        this.titulo = titulo;
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return id_topico + " -- " + titulo + " -- " + categoria;
    }

    public int getId_topico() {
        return id_topico;
    }

    public void setId_topico(int id_topico) {
        this.id_topico = id_topico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

