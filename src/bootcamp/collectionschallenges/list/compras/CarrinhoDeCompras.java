package bootcamp.collectionschallenges.list.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerDoCarrinho = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerDoCarrinho.add(item);
            }
        }

        carrinho.removeAll(removerDoCarrinho);
    }

    public String calcularValorTotal() {
        double precoTotal = 0.0;

        for (Item item : carrinho) {
            precoTotal += item.getPreco() * item.getQuantidade();
        }

        return "Preço total: R$ " + precoTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
