package br.edu.univas;


public class LancheXTudo extends Lanche {

    @Override
    public void adicionarIngredientes() {
        System.out.println("Adicionando os seguintes ingredientes: alface, milho, tomate, bacon, hamburguer, ovo, batata palha, calabresa, queijo"); 
    }

    @Override
    public void prepararLanche() {
        System.out.println("Preparando XTudo");
    } 
}
