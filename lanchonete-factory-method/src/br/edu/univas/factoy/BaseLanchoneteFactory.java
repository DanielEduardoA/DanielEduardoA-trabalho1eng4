package br.edu.univas.factoy;

public abstract class BaseLanchoneteFactory {

    public abstract Lanche criarPedido(int opcao);
    
    public void processarPedido(Lanche lanche) {
        lanche.adicionarIngredientes();
        lanche.prepararLanche();
        lanche.embalarLanche();
    }
}
