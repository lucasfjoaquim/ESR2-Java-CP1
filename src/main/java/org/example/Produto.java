package org.example;

public class Produto {

        private String nome;
        private Double valor;
        private Integer quantidade;
        private Double valorFinal;


    public Produto(String nome, Double valor, Integer quantidade){
            this.nome = nome;
            this.valor = valor;
            this.quantidade = quantidade;
            this.valorFinal = this.valor * quantidade;
        }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValorFinal() {
        return valorFinal;
    }
}