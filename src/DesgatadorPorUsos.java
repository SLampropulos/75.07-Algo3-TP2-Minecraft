public class DesgatadorPorUsos implements Desgatador {

    private int durabilidadAQuitar;
    private int usos;

    public DesgatadorPorUsos(int i,int i2) {
        usos = i;
        durabilidadAQuitar = i2;
    }

    @Override
    public int calcularDesgaste() {
        if(usos == 0) return durabilidadAQuitar;
        usos -= 1;
        return 0;
    }

    public int usosRestante() {
        return usos;
    }
}
