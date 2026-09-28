package POO.DesafioComposicao;

public class ClienteTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Camiseta", 50.0, 3);
        compra1.adicionarItem(new Produto("Calça", 100.0), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caneta", 5.00, 4);
        compra2.adicionarItem(new Produto("Borracha", 10.00), 5);

        Cliente cliente = new Cliente("João");
        cliente.addCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println("Valor total da compra: " + cliente.PrecoTotal());
    }
}
