package br.edu.univas;


public class Lanchonete {
    private static final String X_TUDO = "X Tudo";
    private static final String X_CALABRESA = "X Calabresa";
    private static final String VEGETARIANO = "vegetarianO";
    private static final String X_SALADA = "X Salada";
    private static final String X_BACON = "X Bacon";
   
    public void receberPedido(String tipo) {
        Lanche lanche = null;
        switch (tipo.toLowerCase())
        {
            case X_TUDO:
                lanche = new LancheXTudo();
                break;
            case X_CALABRESA:
                lanche = new LancheXCalabresa();
                break;
            case VEGETARIANO:
                lanche = new LancheVegetariano();
                break;
            case X_SALADA:
                lanche = new LancheXSalada();
                break;
            case X_BACON:
                lanche = new LancheXBacon();
                break;
            default:
                System.err.println("Lanche não disponível");
                System.exit(0);
        }
        lanche.adicionarIngredientes();
        lanche.prepararLanche();
        lanche.embalarLanche();
    }
}
