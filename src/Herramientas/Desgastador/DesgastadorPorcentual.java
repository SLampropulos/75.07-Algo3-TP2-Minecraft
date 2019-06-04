package Herramientas.Desgastador;

public class DesgastadorPorcentual implements Desgatador {
    private float indiceDesgaste;

    public DesgastadorPorcentual(float i, float i1) {
        indiceDesgaste = i*i1/100;
    }

    @Override
    public float calcularDesgaste() {
        return indiceDesgaste;
    }
}
