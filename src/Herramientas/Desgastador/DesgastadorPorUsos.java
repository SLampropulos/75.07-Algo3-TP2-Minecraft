package Herramientas.Desgastador;

public class DesgastadorPorUsos implements factorDesgastador {

    private int durabilidadAQuitar;
    private int usos;

    //Constructor
    public DesgastadorPorUsos(int limiteUsos, int durabilidadHerramienta) {
        usosRestantes = limiteUsos;
        durabilidadAQuitar = durabilidadHerramienta;
    }

    @Override
    //Post: Devuelve el desgaste
    public int calcularDesgaste() {
        if(usosRestantes == 0) return durabilidadAQuitar;
        usosRestantes -= 1;
        return 0;
    }

    public int usosRestantes() {
        return usos;
    }
}
