package Classe.Restaurante;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Hambúrguer", 1.6 );
        Comida c2 = new Comida("Pizza", 2.4);

        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.comer(c1);
        p1.comer(c2);

        System.out.println("Peso inicial: 100 kg");
        System.out.println(p1.nome + " agora pesa " + p1.peso + " kg.");
    }
}
