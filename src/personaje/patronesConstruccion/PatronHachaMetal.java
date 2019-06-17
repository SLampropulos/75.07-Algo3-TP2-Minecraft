package personaje.patronesConstruccion;

import herramientas.HachaMetal;
import herramientas.Herramienta;
import materiales.Madera;
import materiales.Metal;

public class PatronHachaMetal extends PatronConstruccion {

    public PatronHachaMetal(){
        material[0][0] = new Metal();
        material[0][1] = new Metal();
        material[1][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaMetal();
    }
}
