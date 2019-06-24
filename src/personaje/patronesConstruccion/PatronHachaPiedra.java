package personaje.patronesConstruccion;

import herramientas.HachaPiedra;
import herramientas.Herramienta;
import materiales.Madera;
import materiales.Piedra;

public class PatronHachaPiedra extends PatronConstruccion {

    public PatronHachaPiedra(){
    	patron[0][0] = new Piedra();
    	patron[0][1] = new Piedra();
    	patron[1][0] = new Piedra();
    	patron[1][1] = new Madera();
    	patron[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaPiedra();
    }

}
