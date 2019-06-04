package Herramientas.Desgastador;

public class DesgatadorPorUsos implements Desgatador {

    private float durabilidadAQuitar;
    private float usos;

    public DesgatadorPorUsos(float i,float i2) {
        usos = i;
        durabilidadAQuitar = i2;
    }

    @Override
    public float calcularDesgaste() {
        if(usos == 0) return durabilidadAQuitar;
        usos -= 1;
        return 0;
    }

    public float usosRestante() {
        return usos;
    }
}
