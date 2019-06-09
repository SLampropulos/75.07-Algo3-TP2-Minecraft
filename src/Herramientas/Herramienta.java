package Herramientas;

import Herramientas.Desgastador.Desgastador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public abstract class Herramienta {
    protected float durabilidad;
    protected float fuerza;
    protected Desgastador desgastador;

    public Herramienta(float durabilidadDada, float fuerzaDada){
        durabilidad = durabilidadDada;
        fuerza = fuerzaDada;
    }

    public float getDurabilidad(){return durabilidad;}
    
    public float getFuerza(){return fuerza;}

    public void desgastar() {
        durabilidad -= desgastador.calcularDesgaste();
    }

    public float usar(){
        this.desgastar();
        return fuerza;
    }

	public abstract void desgastarA(Piedra piedra);

	public abstract void desgastarA(Metal metal);

	public abstract void desgastarA(Diamante diamante);

	public abstract void desgastarA(Madera madera);
}
