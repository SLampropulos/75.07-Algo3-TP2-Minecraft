package Herramientas;

import Herramientas.Desgastador.factorDesgastador;

public class Herramienta {
    protected static int durabilidad;
    protected static int fuerza;
    protected static factorDesgastador desgaste;

    //Constructor
    public Herramienta(int durabilidadDada, int fuerzaDada){
        durabilidad = durabilidadDada;
        fuerza = fuerzaDada;
    }

    //Post: Devuelve el parámetro durabilidad
    public int obtenerDurabilidad(){return durabilidad;}
    
    //Post: Devuelve el parámetro fuerza
    public int obtenerFuerza(){return fuerza;}

    //Post: Produce un desgaste en la herramienta según su tipo
    public static void desgastar() {
        durabilidad -= desgaste.calcularDesgaste();
    }

    //Post: Devuelve el valor de desgaste producido
    //Pendiente: Genera bug con desgaste por usos. Revisar
    public int obtenerDesgaste() {
        return this.desgaste.calcularDesgaste();
    }
}
