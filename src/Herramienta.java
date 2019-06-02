public class Herramienta {
    protected static int durabilidad;
    protected static int fuerza;
    protected static Desgatador desgastador;

    protected Herramienta(int durabilidadDada, int fuerzaDada){
        durabilidad = durabilidadDada;
        fuerza = fuerzaDada;
    }

    public int getDurabilidad(){return durabilidad;}
    public int getFuerza(){return fuerza;}

    public static void desgastar() {
        durabilidad -= desgastador.calcularDesgaste();
    }

    public int getDesgaste() {
        return this.desgastador.calcularDesgaste();
    }
}
