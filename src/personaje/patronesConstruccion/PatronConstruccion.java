package personaje.patronesConstruccion;

import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;

public abstract class PatronConstruccion {

    Material[][] material = new Material[3][3];

    public PatronConstruccion(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                material[i][j] = MaterialNull.getInstancia();
            }
        }

    }

    public boolean comparar(Material[][] materialDado){
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ok &= (materialDado[i][j].getClass() == material[i][j].getClass());
            }
        }
        return ok;
    }

    public abstract Herramienta fabricar();
}
