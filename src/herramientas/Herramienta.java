package herramientas;

import herramientas.desgastador.Desgastador;
import materiales.*;

public abstract class Herramienta {

    protected int durabilidad;
    protected int fuerza;
    protected Desgastador desgastador;

    public Herramienta(int durabilidadDada, int fuerzaDada){
        durabilidad = durabilidadDada;
        fuerza = fuerzaDada;
    }

    public int obtenerDurabilidad(){return durabilidad;}
    
    public int obtenerFuerza(){return fuerza;}

    public void desgastar() {
        durabilidad -= desgastador.calcularDesgaste();
    }

    public void golpear(Material material) {
        this.desgastar();
        material.desgastarCon(this);
    }

	public abstract void desgastarA(Piedra piedra);

	public abstract void desgastarA(Metal metal);

	public abstract void desgastarA(Diamante diamante);

	public abstract void desgastarA(Madera madera);

}
