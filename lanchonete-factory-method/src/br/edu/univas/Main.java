package br.edu.univas;
import java.util.Scanner;

import br.edu.univas.factoy.BaseLanchoneteFactory;
import br.edu.univas.factoy.LanchoneteFactory;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o sabor desejado:");
            String sabor = sc.nextLine();
            BaseLanchoneteFactory pizzaFactory = new LanchoneteFactory();
            pizzaFactory.criarPedido(sabor);
        }
    }
}