package herramientas.desgastador;

public class DesgastadorLineal implements Desgastador {

    private float desgaste;

    public DesgastadorLineal(float fuerza, float i) {
        desgaste = fuerza / i;
    }


    @Override
    public float calcularDesgaste() {
        return desgaste;
    }

}
