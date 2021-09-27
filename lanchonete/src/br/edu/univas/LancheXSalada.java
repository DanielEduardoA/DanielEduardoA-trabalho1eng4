package br.edu.univas;


public class LancheXSalada extends Lanche {

    @Override
    public void adicionarIngredientes() {
        System.out.println("Adicionando os seguintes ingredientes: alface, tomate, hamburguer, milho, queijo");
    }

    @Override
    public void prepararLanche() {
        System.out.println("Preparando XSalada");
    }
}