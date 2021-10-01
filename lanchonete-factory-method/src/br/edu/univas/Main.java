package br.edu.univas;
import java.util.Scanner;

import br.edu.univas.factoy.BaseLanchoneteFactory;
import br.edu.univas.factoy.Lanche;
import br.edu.univas.factoy.LanchoneteFactory;

public class Main {

    public static void main(String[] args) {
        int opcao = mostrarMenu();
        BaseLanchoneteFactory pizzaFactory = new LanchoneteFactory();
        Lanche lanche = pizzaFactory.criarPedido(opcao);
        pizzaFactory.processarPedido(lanche);
    }
    
    private static int mostrarMenu() {
        int opcao;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Menu");
            System.out.println("1 - X Tudo");
            System.out.println("2 - X Calabresa");
            System.out.println("3 - Vegetariano");
            System.out.println("4 - X Salada");
            System.out.println("5 - X Bacon");
            System.out.println("Entre com a opção referente ao lanche desejado:");
            opcao = sc.nextInt();
        }
        return opcao;
    }
}