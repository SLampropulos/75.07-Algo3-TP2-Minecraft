package personaje.patronesConstruccion;

import herramientas.HachaPiedra;
import herramientas.Herramienta;
import materiales.Madera;
import materiales.Piedra;

public class PatronHachaPiedra extends PatronConstruccion {

    public PatronHachaPiedra(){
        material[0][0] = new Piedra();
        material[0][1] = new Piedra();
        material[1][0] = new Piedra();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }

    @Override
    public Herramienta fabricar() {
        return new HachaPiedra();
    }

}
