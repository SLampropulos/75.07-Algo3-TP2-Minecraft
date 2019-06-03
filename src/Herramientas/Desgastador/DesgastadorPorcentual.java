package Herramientas.Desgastador;

public class DesgastadorPorcentual implements Desgatador {
    private int indiceDesgaste;

    public DesgastadorPorcentual(int i, int i1) {
        indiceDesgaste = i*i1/100;
    }

    @Override
    public int calcularDesgaste() {
        return indiceDesgaste;
    }
}
