package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoMetal;
import materiales.Madera;
import materiales.Metal;

public class PatronPicoMetal extends PatronConstruccion {

    public PatronPicoMetal(){
        material[0][0] = new Metal();
        material[1][0] = new Metal();
        material[2][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoMetal();
    }
}
