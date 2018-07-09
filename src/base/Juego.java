package base;

/**
 *
 * @author Ivis Chavez
 */
public class Juego {
    private int id, puntaje;
    private boolean arma1, arma2, vida, ataque, curacion;

    public Juego() {
    }

    public Juego(int id, int puntaje, boolean arma1, boolean arma2, boolean vida, boolean ataque, boolean curacion) {
        this.id = id;
        this.puntaje = puntaje;
        this.arma1 = arma1;
        this.arma2 = arma2;
        this.vida = vida;
        this.ataque = ataque;
        this.curacion = curacion;
    }

    public Juego(int puntaje, boolean arma1, boolean arma2, boolean vida, boolean ataque, boolean curacion) {
        this.puntaje = puntaje;
        this.arma1 = arma1;
        this.arma2 = arma2;
        this.vida = vida;
        this.ataque = ataque;
        this.curacion = curacion;
    }

    public Juego(int id) {
        this.id = id;
    }

    public Juego(int id, int puntaje) {
        this.id = id;
        this.puntaje = puntaje;
    }

    public Juego(int id, boolean arma1) {
        this.id = id;
        this.arma1 = arma1;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public boolean getArma1() {
        return arma1;
    }

    public void setArma1(boolean arma1) {
        this.arma1 = arma1;
    }

    public boolean getArma2() {
        return arma2;
    }

    public void setArma2(boolean arma2) {
        this.arma2 = arma2;
    }

    public boolean getVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public boolean getAtaque() {
        return ataque;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    public boolean getCuracion() {
        return curacion;
    }

    public void setCuracion(boolean curacion) {
        this.curacion = curacion;
    }
    
    
}

