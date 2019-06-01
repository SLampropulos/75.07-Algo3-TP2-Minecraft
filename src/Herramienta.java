public class Herramienta {
    private static int durabilidad;
    private static int fuerza;

    private Herramienta(){}

    public static Herramienta HachaMadera() {
        Herramienta hachaMadera = new Herramienta();
        durabilidad = 100;
        fuerza = 2;
        return hachaMadera;
    }

    public int getDurabilidad(){return durabilidad;}
    public int getFuerza(){return fuerza;}

}
