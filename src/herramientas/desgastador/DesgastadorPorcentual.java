package herramientas.desgastador;

public class DesgastadorPorcentual implements Desgastador {

    private int porcentaje;
    private int durabilidad;

    public DesgastadorPorcentual(int durabilidadDada, int indiceDesgaste) {
        durabilidad = durabilidadDada;
        porcentaje = indiceDesgaste;
    }

    @Override
    public int calcularDesgaste() {
        int desgaste = durabilidad * porcentaje / 100;
        durabilidad -= desgaste;
        return desgaste;
    }
}
