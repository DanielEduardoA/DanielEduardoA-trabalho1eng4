package br.edu.univas;

public abstract class Lanche {

    public abstract void adicionarIngredientes();
    
    public abstract void prepararLanche();
    
    public void embalarLanche() {
        System.out.println("Embalando lanche para a entrega");
    }
}