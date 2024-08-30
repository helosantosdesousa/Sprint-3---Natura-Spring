package br.com.fiap.naturaspring.domain;

import br.com.fiap.naturaspring.domain.post.Post;
import br.com.fiap.naturaspring.domain.post.PostDAO;
import br.com.fiap.naturaspring.domain.topico.Topico;
import br.com.fiap.naturaspring.domain.topico.TopicoDAO;
import br.com.fiap.naturaspring.domain.usuario.Usuario;
import br.com.fiap.naturaspring.domain.usuario.UsuarioDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
//import br.com.fiap.naturaspring.domain.usuario.UsuarioService;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario;

        PostDAO postDAO = new PostDAO();
        Post post;

        TopicoDAO topicoDAO = new TopicoDAO();
        Topico topico;

//*************** TABELA NATURA_USUARIOS *****************

            // ------- Inserir na tabela natura_usuarios ------------
        //usuario = new Usuario("41278695025", "analauramoura", "analaura@fiap.com", "ouro");
        //usuarioDAO.criarConta(usuario);

        //usuario = new Usuario("13456928030", "rodrigueslais", "laisrodrigues@fiap.com", "semente");
        //usuarioDAO.criarConta(usuario);

            // ------- Pesquisar usuário ------------

        /*Usuario pesquisa = usuarioDAO.pesquisarUsername("laura");

        if (pesquisa == null) {
            System.out.println("Usuário não existe.");
        } else {
            System.out.println("********* CPF -- USERNAME **********");
            System.out.println(pesquisa.getCpf() + " -- " + pesquisa.getUsername());
        }*/

            // ------------- Atualização do cpf do usuário ------------
        //usuarioDAO.atualizar(new Usuario("mariana", 999));

            // ------------ Remoção de um usuário ------------
        //usuarioDAO.apagarConta("julia");

            // ------------- Listagem dos usuários ---------------
        /*List<Usuario> lista = usuarioDAO.listar();
        for(Usuario u : lista) {
            System.out.println(u);
        }*/
//*************** TABELA NATURA_POSTS *****************


            // ------- Inserção na tabela natura_posts ------------

        /*String dataString = "29/08/2024";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataString, formato);
        post = new Post(1111, "Chegaram os novos KITS", data);
        postDAO.criarPost(post);*/

            // ------------ Remoção de um post ------------
        //postDAO.apagarPost(1111);

//*************** TABELA NATURA_TOPICOS *****************

            // ------- Inserção na tabela natura_topicos ------------
        /*topico = new Topico(2, "Data do novo KIT rosas egípcias",
                "Lançamentos");
        topicoDAO.criarTopico(topico);*/

            // ------------- Listagem dos tópicos ---------------
        /*List<Topico> lista = topicoDAO.listar();
        for(Topico t : lista) {
            System.out.println(t);
        }*/
    }




    }

