public class DesgatadorLineal implements Desgatador {

    private final int indiceDesgaste;

    public DesgatadorLineal(int fuerza, int i) {
        indiceDesgaste = fuerza/i;
    }

    @Override
    public int calcularDesgaste() {
        return indiceDesgaste;
    }

}
