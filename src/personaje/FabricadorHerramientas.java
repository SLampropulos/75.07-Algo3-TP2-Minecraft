package personaje;

import excepciones.EspacioOcupadoException;
import excepciones.ExceptionFabricacionNoValida;
import herramientas.Herramienta;
import materiales.Material;
import materiales.MaterialNull;
import personaje.patronesConstruccion.*;

import java.util.ArrayList;

public class FabricadorHerramientas {

    Material componentes[][] = new Material[3][3];
    ArrayList<PatronConstruccion> patronesContrucciones = new ArrayList<PatronConstruccion>();

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
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                componentes[i][j] = MaterialNull.getInstancia();
            }
        }
    }

    public ArrayList<Material> getMateriales() {
        ArrayList<Material> listaElementos = new ArrayList<>();
        for(int i=0; i<3;i++) {
            for (int j = 0; j < 3; j++) {
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
            if( patronConstruccionActual.comparar(componentes)){return patronConstruccionActual.fabricar();}
        }
        throw new ExceptionFabricacionNoValida();
    }

    public Material remover(int columna, int fila) {
        Material materialRetirado = componentes[columna][fila];
        componentes[columna][fila] = MaterialNull.getInstancia();
        return materialRetirado;
    }

}
