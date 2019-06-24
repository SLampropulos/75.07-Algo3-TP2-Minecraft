package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoPiedra;
import materiales.Madera;
import materiales.Piedra;

public class PatronPicoPiedra extends PatronConstruccion {

    public PatronPicoPiedra(){
    	patron[0][0] = new Piedra();
    	patron[1][0] = new Piedra();
    	patron[1][1] = new Madera();
    	patron[1][2] = new Madera();
    	patron[2][0] = new Piedra();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoPiedra();
    }
}
