package personaje;

import excepciones.FabricacionNoValidaExcepcion;
import excepciones.EspacioOcupadoExcepcion;
import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;
import personaje.patronesConstruccion.*;

import java.util.ArrayList;

public class FabricadorHerramientas {

	//Declaración de constantes
	final int CANTIDAD_FILAS_PATRON = 3;
	final int CANTIDAD_COLUMNAS_PATRON = 3;
	
	//Declaración de variables
    Material componentes[][] = new Material[CANTIDAD_FILAS_PATRON][CANTIDAD_COLUMNAS_PATRON]; //Mirar luego
    ArrayList<PatronConstruccion> patronesContruccion = new ArrayList<PatronConstruccion>();

    //Constructor
    public FabricadorHerramientas(){
        this.inicializarPatron();
        patronesContruccion.add(new PatronHachaMadera());
        patronesContruccion.add(new PatronHachaPiedra());
        patronesContruccion.add(new PatronHachaMetal());
        patronesContruccion.add(new PatronPicoMadera());
        patronesContruccion.add(new PatronPicoPiedra());
        patronesContruccion.add(new PatronPicoMetal());
        patronesContruccion.add(new PatronPicoFino());
    }

    //Post: Se inicializan los elementos del auxiliar del patrón
    private void inicializarPatron(){
        for(int i = 0; i < CANTIDAD_FILAS_PATRON; i++){
            for(int j = 0; j < CANTIDAD_COLUMNAS_PATRON; j++){
                componentes[i][j] = MaterialNull.obtenerInstancia();
            }
        }
    }

    //Post: Se indican los elementos cargados en el patrón
    public ArrayList<Material> obtenerElementosFabricadores() {
        ArrayList listaElementos = new ArrayList();
        for(int i = 0; i < CANTIDAD_FILAS_PATRON; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_PATRON; j++) {
                listaElementos.add(componentes[i][j]);
            }
        }
        return listaElementos;
    }
    
    public void agregar(Material material, int columna, int fila) throws EspacioOcupadoExcepcion {
    	if(componentes[columna][fila] != MaterialNull.obtenerInstancia())throw new EspacioOcupadoExcepcion();
        componentes[columna][fila] = material;
    }
    
    public Material obtener(int columna, int fila) {
        return componentes[columna][fila];
    }

    public Herramienta fabricar() throws FabricacionNoValidaExcepcion {
        for (int i = 0; i < patronesContruccion.size(); i++){
            PatronConstruccion patronConstruccionActual = patronesContruccion.get(i);
            if( patronConstruccionActual.comparar(componentes)){return patronConstruccionActual.fabricar();}
        }
        throw new FabricacionNoValidaExcepcion();
    }

    public Material remover(int columna, int fila) {
        Material materialRetirado = componentes[columna][fila];
        componentes[columna][fila] = MaterialNull.obtenerInstancia();
        return materialRetirado;
    }
}