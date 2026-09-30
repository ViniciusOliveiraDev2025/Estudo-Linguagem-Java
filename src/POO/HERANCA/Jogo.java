package POO.HERANCA;

public class Jogo {
    public static void main(String[] args) {


        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;

        Jogador j2 = new Jogador();
        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);
        System.out.println(j1.vida);
        System.out.println(j2.vida);

        System.out.println("==============================");

        Monstro j3 = new Monstro();
        j3.x = 10;
        j3.y = 10;

        Heroi j4 = new Heroi();
        j4.x = 10;
        j4.y = 11;

        System.out.println(j3.vida);
        System.out.println(j4.vida);

        j3.atacar(j4);
        j4.atacar(j3);
        System.out.println("Mostro tem:" + j3.vida);
        System.out.println("Herói tem:" + j4.vida);

    }
}
