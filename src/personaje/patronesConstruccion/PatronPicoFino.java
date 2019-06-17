package personaje.patronesConstruccion;

import herramientas.Herramienta;
import herramientas.PicoFino;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

public class PatronPicoFino extends PatronConstruccion {

    public PatronPicoFino(){
        material[0][0] = new Metal();
        material[0][1] = new Piedra();
        material[1][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Metal();
    }

    @Override
    public Herramienta fabricar() {
        return new PicoFino();
    }
}
