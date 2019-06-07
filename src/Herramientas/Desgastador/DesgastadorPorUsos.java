package Herramientas.Desgastador;

public class DesgastadorPorUsos implements Desgastador {

    private float durabilidadAQuitar;
    private int usos;

    public DesgastadorPorUsos(int limiteUsos, float durabilidadHerramienta) {
        usos = limiteUsos;
        durabilidadAQuitar = durabilidadHerramienta;
    }

    @Override
    public float calcularDesgaste() {
        if(usos == 0) return durabilidadAQuitar;
        usos -= 1;
        return 0;
    }

    public int usosRestantes() {
        return usos;
    }

}
