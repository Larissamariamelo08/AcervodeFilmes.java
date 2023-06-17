package com.example.demo;

class Cadasatro {
    private String nome;
    private double cpf;
    private double num_cartao;
    private int idade;
    private String usuario;
    private String senha;
    private String Plano;

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getNum_cartao() {
        return num_cartao;
    }

    public void setNum_cartao(double num_cartao) {
        this.num_cartao = num_cartao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPlano() {
        return Plano;
    }

    public void setPlano(String plano) {
        Plano = plano;
    }

    //ainda não comecei a agregacao com a classe Login
}
