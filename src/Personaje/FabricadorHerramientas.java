package Personaje;

import Exceptions.ExceptionFabricacionNoValida;
import Herramientas.Herramienta;
import Materiales.Material;
import Materiales.MaterialNull;

import java.util.ArrayList;

public class FabricadorHerramientas {

    Material componentes[][] = new Material[3][3];
    ControladorDeFabricacion controladorFabricador;

    public FabricadorHerramientas(){
        this.setComponentes();
        controladorFabricador = new ControladorDeFabricacion();
    }

    private void setComponentes(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                componentes[i][j] = new MaterialNull();
            }
        }
    }

    public ArrayList getElementosFabricacoderes() {
        ArrayList listaElementos = new ArrayList();
        for(int i=0; i<3;i++) {
            for (int j = 0; j < 3; j++) {
                listaElementos.add(componentes[i][j]);
            }
        }
        return listaElementos;
    }
    public void agregar(Material material, int columna, int fila) {
        componentes[columna][fila] = material;
    }
    public Material obtener(int columna, int fila) {
        return componentes[columna][fila];
    }

    public Herramienta fabricar() {
        Herramienta fabricada = controladorFabricador.fabricar(componentes);
        if (null == fabricada) {
            new ExceptionFabricacionNoValida();
        }
        this.setComponentes();
        return fabricada;
    }

    public Material remover(int columna, int fila) {
        Material materialRetirado = componentes[columna][fila];
        componentes[columna][fila] = new MaterialNull();
        return materialRetirado;
    }
}
