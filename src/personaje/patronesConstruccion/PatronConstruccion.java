package personaje.patronesConstruccion;

import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;

public abstract class PatronConstruccion {

    Material[][] material = new Material[CANTIDAD_MATERIALES_FILA_PATRON][CANTIDAD_MATERIALES_COLUMNA_PATRON];

    static final int CANTIDAD_MATERIALES_FILA_PATRON = 3;
    static final int CANTIDAD_MATERIALES_COLUMNA_PATRON = 3;
    
    public PatronConstruccion(){
        for (int i = 0; i < CANTIDAD_MATERIALES_FILA_PATRON; i++) {
            for (int j = 0; j < CANTIDAD_MATERIALES_COLUMNA_PATRON; j++) {
                material[i][j] = MaterialNull.getInstancia();
            }
        }

    }

    public boolean comparar(Material[][] materialDado){
        boolean ok = true;
        for (int i = 0; i < CANTIDAD_MATERIALES_FILA_PATRON; i++) {
            for (int j = 0; j < CANTIDAD_MATERIALES_COLUMNA_PATRON; j++) {
                ok &= (materialDado[i][j].getClass() == material[i][j].getClass());
            }
        }
        return ok;
    }

    public abstract Herramienta fabricar();
}
