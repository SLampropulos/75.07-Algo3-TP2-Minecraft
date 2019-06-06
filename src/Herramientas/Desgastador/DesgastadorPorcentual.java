package Herramientas.Desgastador;

public class DesgastadorPorcentual implements Desgastador {

    private float porcentaje;
    private float durabilidad;

    public DesgastadorPorcentual(float durabilidadDada, float indiceDesgaste) {
        durabilidad = durabilidadDada;
        porcentaje = indiceDesgaste;
    }

    @Override
    public float calcularDesgaste() {
        float desgaste = durabilidad*porcentaje/100;
        durabilidad -= desgaste;
        return desgaste;
    }
}
