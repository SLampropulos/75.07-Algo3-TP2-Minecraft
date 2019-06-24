package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoMetal;
import materiales.Madera;
import materiales.Metal;

public class PatronPicoMetal extends PatronConstruccion {

    public PatronPicoMetal(){
    	patron[0][0] = new Metal();
    	patron[1][0] = new Metal();
    	patron[2][0] = new Metal();
    	patron[1][1] = new Madera();
    	patron[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoMetal();
    }
}
