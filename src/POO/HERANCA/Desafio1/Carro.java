package POO.HERANCA.Desafio1;

public class Carro {
    int velocidadeAtual = 0;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void freiar() {
        velocidadeAtual -= 5;
        if (velocidadeAtual < 5) {
            velocidadeAtual = 0;
        }
    }

}
