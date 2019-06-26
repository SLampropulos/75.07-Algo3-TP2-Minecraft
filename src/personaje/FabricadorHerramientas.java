package personaje;

import excepciones.EspacioOcupadoException;
import excepciones.ExceptionFabricacionNoValida;
import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;
import personaje.patronesConstruccion.*;

import java.util.ArrayList;

public class FabricadorHerramientas {

    Material componentes[][] = new Material[CANTIDAD_MATERIALES_FILA_PATRON][CANTIDAD_MATERIALES_COLUMNA_PATRON];
    ArrayList<PatronConstruccion> patronesContrucciones = new ArrayList<PatronConstruccion>();

    static final int CANTIDAD_MATERIALES_FILA_PATRON = 3;
    static final int CANTIDAD_MATERIALES_COLUMNA_PATRON = 3;
    
    public FabricadorHerramientas(){
        this.setComponentes();
        patronesContrucciones.add(new PatronHachaMadera());
        patronesContrucciones.add(new PatronHachaPiedra());
        patronesContrucciones.add(new PatronHachaMetal());
        patronesContrucciones.add(new PatronPicoMadera());
        patronesContrucciones.add(new PatronPicoPiedra());
        patronesContrucciones.add(new PatronPicoMetal());
        patronesContrucciones.add(new PatronPicoFino());

    }

    private void setComponentes(){
        for(int i = 0; i < CANTIDAD_MATERIALES_FILA_PATRON; i++){
            for(int j = 0; j < CANTIDAD_MATERIALES_COLUMNA_PATRON; j++){
                componentes[i][j] = MaterialNull.getInstancia();
            }
        }
    }

    public ArrayList<Material> getMateriales() {
        ArrayList<Material> listaElementos = new ArrayList<>();
        for(int i = 0; i < CANTIDAD_MATERIALES_FILA_PATRON;i++) {
            for (int j = 0; j < CANTIDAD_MATERIALES_COLUMNA_PATRON; j++) {
                if(componentes[i][j] == MaterialNull.getInstancia()) continue;
                listaElementos.add( remover(i, j) );
            }
        }
        return listaElementos;
    }

    public void agregar(Material material, int columna, int fila) throws EspacioOcupadoException {
        if(componentes[columna][fila] != MaterialNull.getInstancia())throw new EspacioOcupadoException();
        componentes[columna][fila] = material;
    }
    
    public Material obtener(int columna, int fila) {
        return componentes[columna][fila];
    }

    public Herramienta fabricar() throws ExceptionFabricacionNoValida {
        for (int i = 0; i < patronesContrucciones.size(); i++){
            PatronConstruccion patronConstruccionActual = patronesContrucciones.get(i);
            if( patronConstruccionActual.comparar(componentes)){
                setComponentes();
                return patronConstruccionActual.fabricar();
            }
        }
        throw new ExceptionFabricacionNoValida();
    }

    public Material remover(int columna, int fila) {
        Material materialRetirado = componentes[columna][fila];
        componentes[columna][fila] = MaterialNull.getInstancia();
        return materialRetirado;
    }

}
