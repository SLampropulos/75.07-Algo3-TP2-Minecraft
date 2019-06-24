package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoMadera;
import materiales.Madera;

public class PatronPicoMadera extends PatronConstruccion {

    public PatronPicoMadera(){
    	patron[0][0] = new Madera();
    	patron[1][0] = new Madera();
    	patron[1][1] = new Madera();
    	patron[1][2] = new Madera();
    	patron[2][0] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoMadera();
    }
}
