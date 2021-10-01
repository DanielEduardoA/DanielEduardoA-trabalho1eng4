package br.edu.univas.factoy;

public class LanchoneteFactory extends BaseLanchoneteFactory {

    @Override
    public Lanche criarPedido(int opcao) {
        Lanche lanche = null;
        switch (opcao)
        {
            case 1:
                lanche = new LancheXTudo();
                break;
            case 2:
                lanche = new LancheXCalabresa();
                break;
            case 3:
                lanche = new LancheVegetariano();
                break;
            case 4:
                lanche = new LancheXSalada();
                break;
            case 5:
                lanche = new LancheXBacon();
                break;
            default:
                System.err.println("Lanche não disponível");
                System.exit(0);
        }
        return lanche;
    }

}
