package herramientas.desgastador;

public class DesgastadorPorUsos implements Desgastador {

    private int durabilidadAQuitar;
    private int usos;

    public DesgastadorPorUsos(int limiteUsos, int durabilidadHerramienta) {
        usos = limiteUsos;
        durabilidadAQuitar = durabilidadHerramienta;
    }

    @Override
    public int calcularDesgaste() {
        if(usos == 0) return durabilidadAQuitar;
        usos -= 1;
        return 0;
    }

    public int usosRestantes() {
        return usos;
    }

}
