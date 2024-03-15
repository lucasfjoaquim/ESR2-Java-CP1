package org.example;

public class Carrinho {
    Double valorTotal = 0.0;
    String listaDeProdutos = "";
    String listaDePrecos = "";
    String listaDeQuantidades = "";
    String listaDeValorTotalCompra = "";

    public void adicionarCarrinho(String nome, Double valor, Integer quantidade){
        adicionarCompra(new Produto(nome,valor,quantidade));
    }

     public void adicionarCompra(Produto prod){
        this.valorTotal = this.valorTotal + prod.getValorFinal();
        this.listaDeProdutos = this.listaDeProdutos + prod.getNome() + " ";
        this.listaDePrecos = this.listaDePrecos + prod.getValor() + " ";
        this.listaDeQuantidades = this.listaDeQuantidades + prod.getQuantidade() + " ";
        this.listaDeValorTotalCompra = this.listaDeValorTotalCompra + prod.getValorFinal() + " ";
    }

    public void mostrarCarrinho(){
        String[] arrayDeProdutos = this.listaDeProdutos.split(" ");
        String[] arrayPrecos = this.listaDePrecos.split(" ");
        String[] arrayQuantidade = this.listaDeQuantidades.split(" ");
        String[] arrayValorTotal = this.listaDeValorTotalCompra.split(" ");

        int index = arrayPrecos.length;

        for (int x = 0; x < index; x += 1){
            System.out.println("\n===========================================================\n" +
                               "Produto                  : " + arrayDeProdutos[x] + "\n" +
                               "Preço                    : " + arrayPrecos[x] + "\n" +
                               "Quantidade               : " + arrayQuantidade[x] + "\n" +
                               "Valor Total Desta Compra : " + arrayValorTotal[x] + "\n" +
                               "\n=========================================================\n");
        }
        System.out.println("\n===================Resumo Da Compra =====================\n" +
                           "Valor total dos produtos : " + this.valorTotal + "\n" +
                           "Imposto da compra        : " + (this.valorTotal * 0.05) + "\n" +
                           "Valor Final              : " + (this.valorTotal * 1.05) + "\n" +
                           "\n=========================================================\n");

    }
}
