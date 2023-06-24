
import javax.swing.JOptionPane;

//classe cadastro com construtores e getters e setters, e verificação de cpf
class Cadastro {
    private String nome;
    private String cpf;
    private double num_cartao;
    private int idade;
    private String usuario;
    private String senha;
    private String Plano;

    public Cadastro() {
    }

    public Cadastro(String nome, String cpf, double num_cartao, int idade, String usuario, String senha, String plano) {
        this.nome = nome;
        this.setCpf(cpf);
        this.num_cartao = num_cartao;
        this.idade = idade;
        this.usuario = usuario;
        this.senha = senha;
        Plano = plano;
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
                JOptionPane.showMessageDialog(null, "CPF inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido");
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

    // ainda não comecei a agregacao com a classe Login
}
