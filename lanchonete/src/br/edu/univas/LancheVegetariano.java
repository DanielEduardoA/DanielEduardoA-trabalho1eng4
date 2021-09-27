package br.edu.univas;


public class LancheVegetariano extends Lanche {

    @Override
    public void adicionarIngredientes() {
        System.out.println("Adicionando os seguintes ingredientes: alface, tomate, hamburguer de brocólis, queijo, milho"); 
    }

    @Override
    public void prepararLanche() {
        System.out.println("Preparando Vegetariano");
    } 
}
