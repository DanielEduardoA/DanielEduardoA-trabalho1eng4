package br.edu.univas;


public class LancheXBacon extends Lanche {

    @Override
    public void adicionarIngredientes() {
        System.out.println("Adicionando os seguintes ingredientes: alface, tomate, hamburguer, bacon, queijo, milho"); 
    }

    @Override
    public void prepararLanche() {
        System.out.println("Preparando XBacon");
    } 
}
