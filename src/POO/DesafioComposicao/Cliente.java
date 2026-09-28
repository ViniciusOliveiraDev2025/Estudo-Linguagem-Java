package POO.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;

    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void addCompra(Compra compra) {
        this.compras.add(compra);
    }
    double PrecoTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.precoTotal();
        }
        return total;
    }
}
