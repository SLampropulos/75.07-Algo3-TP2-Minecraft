package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoMadera;
import materiales.Madera;

public class PatronPicoMadera extends PatronConstruccion {

    public PatronPicoMadera(){
        material[0][0] = new Madera();
        material[1][0] = new Madera();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoMadera();
    }
}
