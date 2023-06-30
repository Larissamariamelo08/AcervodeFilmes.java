package com.example.trabalho_poo_javafx.Model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String num_cartao;
    private int idade;

    //REVER UTILIDADE
    public void Pessoa() {

    }

    public void Pessoa(String nome, String cpf, String num_cartao, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.num_cartao = num_cartao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (cpf.length() == 11) {
            if (validarCpf(cpf) == true) {
                this.cpf = cpf;
            } else {
                //JOptionPane.showMessageDialog(null, "CPF inválido");
            }
        } else {
            //JOptionPane.showMessageDialog(null, "CPF inválido");
        }
    }

    public boolean validarCpf(String cpf) {

        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            int algarismo = Character.getNumericValue(cpf.charAt(i));
            soma1 += algarismo * (10 - i);
            soma2 += algarismo * (11 - i);
        }

        int resto1 = soma1 % 11;
        int j = (resto1 < 2) ? 0 : (11 - resto1);

        soma2 += j * 2;
        int resto2 = soma2 % 11;
        int k = (resto2 < 2) ? 0 : (11 - resto2);

        int penultimoDigito = Character.getNumericValue(cpf.charAt(9));
        int ultimoDigito = Character.getNumericValue(cpf.charAt(10));

        return j == penultimoDigito && k == ultimoDigito;
    }

    public String getNum_cartao() {
        return num_cartao;
    }

    public void setNum_cartao(String num_cartao) {
        if (num_cartao.length() == 8) {
            this.num_cartao = num_cartao;
        } else {
            //JOptionPane.showMessageDialog(null, "Número de cartão inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 10 && idade <= 100) {
            this.idade = idade;
        } else {
            //JOptionPane.showMessageDialog(null, "Idade inválida");
        }
    }

}