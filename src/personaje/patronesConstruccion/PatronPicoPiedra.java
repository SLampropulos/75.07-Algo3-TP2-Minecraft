package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoPiedra;
import materiales.Madera;
import materiales.Piedra;

public class PatronPicoPiedra extends PatronConstruccion {

    public PatronPicoPiedra(){
        material[0][0] = new Piedra();
        material[1][0] = new Piedra();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Piedra();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoPiedra();
    }
}
