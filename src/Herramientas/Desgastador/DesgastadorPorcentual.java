package Herramientas.Desgastador;

public class DesgastadorPorcentual implements factorDesgastador {
    private int desgaste;

    //Constructor
    public DesgastadorPorcentual(int durabilidad, int indiceDesgaste) {
        desgaste = (int) (durabilidad * indiceDesgaste / 100);
    }

    @Override
    //Post: Devuelve el desgaste
    public int calcularDesgaste() {
        return desgaste;
    }
}
