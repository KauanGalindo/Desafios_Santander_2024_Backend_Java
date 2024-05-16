package CollectionsJava.List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributo
    private List<Item> carrinhoDeCompras;

    // Construtor
    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    // Adicionar Item
    public void addItem (String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    // Remover Item
    public void removeItem (String nome) {
        List<Item> removerItem = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()) {
            for (Item item : carrinhoDeCompras) {
                if (item.getNome().equalsIgnoreCase(nome)){
                    removerItem.add(item);
                }
            }
            carrinhoDeCompras.removeAll(removerItem);
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    // Calcular o valor total dos itens no carrinho
    public double calcularValorTotal() {
        double valorTotalDoCarrinho = 0;
        double quantidade = 0;
        for (int i = 0; i < carrinhoDeCompras.size(); i++) {
            valorTotalDoCarrinho += carrinhoDeCompras.get(i).getPreco();
            quantidade = carrinhoDeCompras.get(i).getQuantidade();
            valorTotalDoCarrinho *= quantidade;
        }
        return valorTotalDoCarrinho;
    }

    // Exibir os itens no carrinho
    public void exibirItens(){
        if (!carrinhoDeCompras.isEmpty()) {
            for (Item item : carrinhoDeCompras) {
                System.out.println(item.toString());
            }
        } else
            System.out.println("Carrinho Vazio!");
    }
}
