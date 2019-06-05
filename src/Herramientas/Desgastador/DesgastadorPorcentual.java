package Herramientas.Desgastador;

public class DesgastadorPorcentual implements factorDesgastador {
    private float porsentaje;
    private float durabilidad;

    public DesgastadorPorcentual(float durabilidadDada, float indiceDesgaste) {
        durabilidad = durabilidadDada;
        porsentaje = indiceDesgaste;
    }

    @Override
    public float calcularDesgaste() {
        float desgaste = durabilidad*porsentaje/100;
        durabilidad -= desgaste;
        return desgaste;
    }
}
