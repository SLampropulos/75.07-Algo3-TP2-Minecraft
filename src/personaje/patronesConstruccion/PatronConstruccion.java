package personaje.patronesConstruccion;

import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;

public abstract class PatronConstruccion {

	//Declaración de constantes
	static final int CANTIDAD_FILAS_PATRON = 3;
	static final int CANTIDAD_COLUMNAS_PATRON = 3;
	
	//Declaración de variables
    Material[][] patron = new Material[CANTIDAD_FILAS_PATRON][CANTIDAD_COLUMNAS_PATRON];

    //Constructor
    public PatronConstruccion(){
        for (int i = 0; i < CANTIDAD_FILAS_PATRON; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_PATRON; j++) {
                patron[i][j] = MaterialNull.obtenerInstancia();
            }
        }
    }

    //Post: Indica si una herramienta se puede crear
    public boolean comparar(Material[][] materialDado){
        boolean ok = true;
        for (int i = 0; i < CANTIDAD_FILAS_PATRON; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_PATRON; j++) {
                ok &= (materialDado[i][j].getClass() == patron[i][j].getClass());
            }
        }
        return ok;
    }

    //Post: Fabrica la herramienta
    public abstract Herramienta fabricar();
}
