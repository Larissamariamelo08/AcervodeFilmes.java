package com.example.trabalho_poo_javafx.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cadastro extends Pessoa {
    private String login;
    private String senha;
    private Pessoa pessoa;

    public Cadastro() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @param nomeArquivo
     */
    public void salvarEmArquivo(String nomeArquivo) {
        Pessoa pessoa = new Pessoa();
        String nome = pessoa.getNome();
        String cpf = pessoa.getCpf();
        String num_cartao = pessoa.getNum_cartao();
        int idade = pessoa.getIdade();
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo, true))) {
            writer.println("Nome: " + nome);
            writer.println("Idade: " + idade);
            writer.println("Cpf: " + cpf);
            writer.println("Numero do Cartao: " + num_cartao);
            writer.println("Login: " + login);
            writer.println("Senha: " + senha);
            writer.println();

            System.out.println("Cadastro salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o cadastro: " + e.getMessage());
        }
    }
}
