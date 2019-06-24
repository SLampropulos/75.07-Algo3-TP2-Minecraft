package personaje.patronesConstruccion;

import herramientas.HachaMadera;
import herramientas.Herramienta;
import materiales.Madera;

public class PatronHachaMadera extends PatronConstruccion {

    public PatronHachaMadera(){
        material[0][0] = new Madera();
        material[0][1] = new Madera();
        material[1][0] = new Madera();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaMadera();
    }
}
