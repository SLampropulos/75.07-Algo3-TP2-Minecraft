package Personaje;

public class ControladorDeMovimiento {

    private int vertical;
    private int horizontal;

    public ControladorDeMovimiento(int vert, int hor) {
        vertical = vert;
        horizontal = hor;
    }


    public int getVertical() {
        return vertical;
    }
    public int getHorizontal() {
        return horizontal;
    }

    public void movDerecha() {
        horizontal += 1;
    }
    public void movIzq() {
        horizontal -=1;
    }
    public void movArriba() {
        vertical += 1;
    }
    public void movAbajo() {
        vertical -= 1;
    }


    public void movArribaDerecha() {
        this.movArriba();
        this.movDerecha();
    }
    public void movArribaIzq() {
        this.movArriba();
        this.movIzq();
    }
    public void movAbajoDerecha() {
        this.movDerecha();
        this.movAbajo();
    }
    public void movAbajoIzq() {
        this.movAbajo();
        this.movIzq();
    }
}
