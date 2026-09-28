package POO.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    public Cliente cliente;
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(quantidade, produto));
    }
    void adicionarItem(String nome,double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(quantidade, produto));

    }

    double precoTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }


}