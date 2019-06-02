public class DesgatadorLineal implements Desgatador {

    private final int indiceDesgaste;

    public DesgatadorLineal(int fuerza, int i) {
        indiceDesgaste = fuerza/i;
    }
    public DesgatadorLineal(int fuerza, int i, int i2) {
        indiceDesgaste = (fuerza*i2)/i;
    }


    @Override
    public int calcularDesgaste() {
        return indiceDesgaste;
    }

}
