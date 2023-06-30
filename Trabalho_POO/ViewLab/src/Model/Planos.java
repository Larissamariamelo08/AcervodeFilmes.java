package com.example.trabalho_poo_javafx.Model;

class Planos {
        private String nome;
        private double preco;
        private String qualidade;
        private String som;

        public void Plano(String nome, double preco, String qualidade, String som) {
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

