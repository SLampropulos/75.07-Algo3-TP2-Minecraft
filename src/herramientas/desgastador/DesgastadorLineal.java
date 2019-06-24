package herramientas.desgastador;

public class DesgastadorLineal implements Desgastador {

    private int desgaste;

    public DesgastadorLineal(float fuerza, float i) {
        desgaste = (int) (fuerza / i);
    }


    @Override
    public int calcularDesgaste() {
        return desgaste;
    }

}
