package br.com.fiap.naturaspring.domain.topico;

public class Topico {
    private int id_topico;
    private String titulo;

    public Topico(int id_topico, String titulo) {
        super();
        this.id_topico = id_topico;
        this.titulo = titulo;
    }

    public Topico(int id_topico) {
        super();
        this.id_topico = id_topico;
    }

    public Topico(String titulo) {
        super();
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return id_topico + " -- " + titulo;
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
}
