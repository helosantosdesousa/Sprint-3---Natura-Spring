package br.com.fiap.naturaspring.domain.usuario;

public class Usuario {
    private int cpf;
    private String username;

    public Usuario(int cpf, String username) {
        super();
        this.cpf = cpf;
        this.username = username;
    }

    public Usuario(String username) {
        super();
        this.username = username;
    }

    public Usuario(int cpf) {
        super();
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return cpf + " -- " + username;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}