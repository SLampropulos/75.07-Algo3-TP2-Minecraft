package Herramientas.Desgastador;

public class DesgastadorLineal implements factorDesgastador {

    private int desgaste;

    //Constructores
    public DesgastadorLineal(int fuerza, int i) {
        indiceDesgaste = fuerza / i;
    }
    public DesgastadorLineal(int fuerza, int i, float i2) {
        desgaste = (int) (fuerza * i2 / i);
    }


    @Override
    //Post: Devuelve el desgaste
    public int calcularDesgaste() {
        return desgaste;
    }

}
