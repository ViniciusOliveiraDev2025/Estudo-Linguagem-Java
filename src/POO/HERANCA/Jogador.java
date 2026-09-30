package POO.HERANCA;

public class Jogador {

    int x, y;
    int vida = 100;

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return  true;
        }else {
            return false;
        }
    }

    boolean mover(Direcao direcao) {
       switch (direcao) {
            case CIMA:
                y--;
                break;
            case BAIXO:
                y++;
                break;
            case ESQUERDA:
                x--;
                break;
            case DIREITA:
                x++;
                break;
       }
        return true;
    }
}
