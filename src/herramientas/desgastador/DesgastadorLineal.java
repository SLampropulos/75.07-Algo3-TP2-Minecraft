package herramientas.desgastador;

public class DesgastadorLineal implements Desgastador {

    private int desgaste;

    public DesgastadorLineal(int fuerza, float indice) {
        desgaste = (int) (fuerza / indice);
    }


    @Override
    public int calcularDesgaste() {
        return desgaste;
    }

}
