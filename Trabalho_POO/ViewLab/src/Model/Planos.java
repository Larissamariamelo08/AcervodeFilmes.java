package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Titulos {
    private String titulo;
    private List<Plano> planos;

    public Titulos(String titulo) {
        this.titulo = titulo;
        this.planos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarPlano(Plano plano) {
        planos.add(plano);
    }

    public void removerPlano(Plano plano) {
        planos.remove(plano);
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Titulos titulos = new Titulos("Esses são os planos disponiveis: 1 - PLANO SIMPLES 2- PLANO PREMIUM");
        Plano plano1 = new Plano("Plano Simples", 18.00, "\nQualidade de video limitada", "\\Recursos limitados: \n");

        Plano plano2 = new Plano("Plano Premium", 25.50, " \nAcesso completo ao acervo:", "\nRecursos avançados \n");

        titulos.adicionarPlano(plano1);
        titulos.adicionarPlano(plano2);

        System.out.println("Geral \n\n" + titulos.getTitulo());

        for (Plano plano : titulos.getPlanos()) {
            System.out.println(
                    plano.getNome() + " - R$ " + plano.getPreco() + " " + plano.getQualidade() + " " + plano.getSom());
        }

        System.out.println("Escolha um plano:");
        int escolher = ler.nextInt();

        switch (escolher) {
            case 1:
                System.out.println("Você escolheu o Plano Simples");
                break;
            case 2:
                System.out.println("Você escolheu o Plano Premium");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    static class Plano {
        private String nome;
        private double preco;
        private String qualidade;
        private String som;

        public Plano(String nome, double preco, String qualidade, String som) {
            this.nome = nome;
            this.preco = preco;
            this.qualidade = qualidade;
            this.som = som;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public String getQualidade() {
            return qualidade;
        }

        public String getSom() {
            return som;
        }
    }
}
