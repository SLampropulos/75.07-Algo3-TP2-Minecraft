package personaje.patronesConstruccion;

import herramientas.HachaMetal;
import herramientas.Herramienta;
import materiales.Madera;
import materiales.Metal;

public class PatronHachaMetal extends PatronConstruccion {

    public PatronHachaMetal(){
        patron[0][0] = new Metal();
        patron[0][1] = new Metal();
        patron[1][0] = new Metal();
        patron[1][1] = new Madera();
        patron[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaMetal();
    }
}
