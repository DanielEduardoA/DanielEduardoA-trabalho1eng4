package br.edu.univas;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o lanche desejado:");
            String lanche = sc.nextLine();
            Lanchonete lanchonete = new Lanchonete();
            lanchonete.receberPedido(lanche);
        }
    }

}
