package br.edu.univas.factoy;

public abstract class BaseLanchoneteFactory {

    public abstract Lanche criarPedido(String tipo);
    
    public void processarPedido(String tipo) {
        Lanche lanche = criarPedido(tipo);
        lanche.adicionarIngredientes();
        lanche.prepararLanche();
        lanche.embalarLanche();
    }
}
