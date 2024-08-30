package br.com.fiap.naturaspring.domain.usuario;

public class Usuario {
    private String cpf;
    private String username;
    private String email;
    private String nivel_natura;

    public Usuario(String cpf, String username, String email, String nivel_natura) {
        super();
        this.cpf = cpf;
        this.username = username;
        this.email = email;
        this.nivel_natura = nivel_natura;
    }



    @Override
    public String toString() {
        return cpf + " -- " + username + " -- "  + email + " -- " + nivel_natura;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel_natura() {
        return nivel_natura;
    }

    public void setNivel_natura(String nivel_natura) {
        this.nivel_natura = nivel_natura;
    }
}