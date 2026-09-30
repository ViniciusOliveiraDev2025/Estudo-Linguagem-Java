package POO.HERANCA;

public class Heroi  extends  Jogador{

    int magia = 100;

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return  true;
        }else {
            return false;
        }
    }

}
