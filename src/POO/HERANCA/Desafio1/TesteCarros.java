package POO.HERANCA.Desafio1;

public class TesteCarros {
    public static void main(String[] args) {
        Carro c1 = new Carro(200);
        Lambo l1 = new Lambo(250);
        Palio p1 = new Palio(180);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Velocidade do carro: " + c1.velocidadeAtual + " Km/h");

        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        l1.acelerar();
        System.out.println("Velocidade do lambo: " + l1.velocidadeAtual + " Km/h");


        p1.acelerar();
        p1.acelerar();
        p1.acelerar();
        p1.acelerar();
        System.out.println("Velocidade do palio: " + p1.velocidadeAtual+ " Km/h");

        System.out.println("---------------------------------");

        c1.freiar();
        c1.freiar();
        c1.freiar();
        System.out.println("Velocidade do carro: " + c1.velocidadeAtual+ " Km/h");


        l1.freiar();
        l1.freiar();
        l1.freiar();
        l1.freiar();
        System.out.println("Velocidade do lambo: " + l1.velocidadeAtual+ " Km/h");


        p1.freiar();
        p1.freiar();
        p1.freiar();
        System.out.println("Velocidade do palio: " + p1.velocidadeAtual+ " Km/h");
    }
}
