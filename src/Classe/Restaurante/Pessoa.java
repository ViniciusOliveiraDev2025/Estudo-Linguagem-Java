package Classe.Restaurante;

public class Pessoa {
    String nome;
    double peso = 100;

    public void comer(Comida comida) {
        this.peso += comida.peso;
    }

}
