package br.edu.univas.factoy;


public class LancheXCalabresa extends Lanche {

    @Override
    public void adicionarIngredientes() {
        System.out.println("Adicionando os seguintes ingredientes: alface, tomate, hamburguer, calabresa, queijo, milho"); 
    }

    @Override
    public void prepararLanche() {
        System.out.println("Preparando XCalabresa");
    } 

}
