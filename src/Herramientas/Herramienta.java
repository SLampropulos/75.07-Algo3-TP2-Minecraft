package Herramientas;

import Herramientas.Desgastador.Desgastador;

public class Herramienta {
    protected static float durabilidad;
    protected static float fuerza;
    protected static Desgastador desgastador;

    public Herramienta(float durabilidadDada, float fuerzaDada){
        durabilidad = durabilidadDada;
        fuerza = fuerzaDada;
    }

    public float getDurabilidad(){return durabilidad;}
    
    public float getFuerza(){return fuerza;}

    public static void desgastar() {
        durabilidad -= desgastador.calcularDesgaste();
    }

    //Pendiente: Genera bug con desgaste por usos. Revisar
    public float obtenerDesgaste() {
        return desgastador.calcularDesgaste();
    }
}
