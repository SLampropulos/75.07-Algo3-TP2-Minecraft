package personaje.patronesConstruccion;

import herramientas.HachaMadera;
import herramientas.Herramienta;
import materiales.Madera;

public class PatronHachaMadera extends PatronConstruccion {

    public PatronHachaMadera(){
        patron[0][0] = new Madera();
        patron[0][1] = new Madera();
        patron[1][0] = new Madera();
        patron[1][1] = new Madera();
        patron[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaMadera();
    }
}
