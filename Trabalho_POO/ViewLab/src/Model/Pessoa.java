package Model;

public class Pessoa {
    private String nome;
    private String cpf;
    private double num_cartao;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, double num_cartao, int idade) {
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

}
