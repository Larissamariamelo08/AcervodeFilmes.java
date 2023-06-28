package View;

import java.util.Scanner;

import Model.Cadastro;

public class CadastroView {
    public CadastroView() {

        Cadastro cadastro = new Cadastro();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            cadastro.setNome(input.nextLine());
            System.out.print("Digite seu cpf: ");
            cadastro.setCpf(input.nextLine());
            System.out.print("Digite seu numero do cartao: ");
            cadastro.setNum_cartao(input.nextDouble());
            System.out.print("Digite sua idade: ");
            cadastro.setIdade(input.nextInt());

        }
    }
}
