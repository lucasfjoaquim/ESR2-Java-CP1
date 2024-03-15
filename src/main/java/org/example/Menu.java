package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    String proximoPasso = "sim";
    public void menu() {
        //Instanciar Carrinho
        Carrinho carrinho = new Carrinho();

        Scanner scanner = new Scanner(System.in);

        while (Objects.equals(proximoPasso, "sim")) {
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o Valor do produto (Como casas decimais demarcadas por virgula): ");
            Double valor = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite a quantidade do produto que deseja comprar: ");
            Integer quantidade = scanner.nextInt();
            scanner.nextLine();

            carrinho.adicionarCarrinho(nome, valor, quantidade);
            System.out.println("Digite sim caso Queira continuar comprando: ");
            this.proximoPasso = scanner.nextLine();
        }

        carrinho.mostrarCarrinho();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
}
