package CollectionsJava.List.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {

        // Lista de Itens
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens
        carrinho.addItem("PS5", 3.599, 2);
        carrinho.addItem("MacBook PRO", 28.999, 1);
        carrinho.addItem("Ipad PRO", 12.299, 1);
        carrinho.addItem("Iphone 15 Pro", 9.299, 1);

        // Exibir itens do carrinho
        carrinho.exibirItens();

        // Valor total dos itens do carrinho
        System.out.println("Valor total dos itens:" + carrinho.calcularValorTotal());

        // Remove item do carrinho
        carrinho.removeItem("MacBook PRO");

        // Pular linha
        System.out.println("");

        // Itens do carrinho atualizado
        carrinho.exibirItens();

        // Valor total dos itens do carrinho atualizado
        System.out.println("Valor total do carrinho:" + carrinho.calcularValorTotal());
    }
}
