package herramientas.desgastador;

public class DesgastadorPorcentual implements Desgastador {

    private float porcentaje;
    private int durabilidad;

    public DesgastadorPorcentual(int durabilidadDada, float indiceDesgaste) {
        durabilidad = durabilidadDada;
        porcentaje = indiceDesgaste;
    }

    @Override
    public int calcularDesgaste() {
        int desgaste = (int) (durabilidad * (porcentaje/100));
        if(desgaste == 0) desgaste = 1;
        durabilidad -= desgaste;
        return desgaste;
    }
}
