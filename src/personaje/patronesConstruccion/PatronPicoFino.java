package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoFino;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

public class PatronPicoFino extends PatronConstruccion {

    public PatronPicoFino(){
    	patron[0][0] = new Metal();
    	patron[0][1] = new Piedra();
    	patron[1][0] = new Metal();
    	patron[1][1] = new Madera();
    	patron[1][2] = new Madera();
    	patron[2][0] = new Metal();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoFino();
    }
}
