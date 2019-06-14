package personaje;

import herramientas.*;
import materiales.*;

public class ControladorDeFabricacion {

    Material material[][] = new Material[3][3];

    public ControladorDeFabricacion(){
        this.setMaterial();
    }

    private void setMaterial(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                material[i][j] = new MaterialNull();
            }
        }
    }

    boolean comparar(Material materialDado[][]){
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ok &= (material[i][j].getClass() == materialDado[i][j].getClass());
            }
        }
        return ok;
    }

    private void modoHachaMadera(){
        this.setMaterial();
        material[0][0] = new Madera();
        material[0][1] = new Madera();
        material[1][0] = new Madera();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }
    private void modoHachaPiedra(){
        this.setMaterial();
        material[0][0] = new Piedra();
        material[0][1] = new Piedra();
        material[1][0] = new Piedra();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }
    private void modoHachaMetal(){
        this.setMaterial();
        material[0][0] = new Metal();
        material[0][1] = new Metal();
        material[1][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
    }
    private void modoPicoMadera(){
        this.setMaterial();
        material[0][0] = new Madera();
        material[1][0] = new Madera();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Madera();
    }
    private void modoPicoPiedra(){
        this.setMaterial();
        material[0][0] = new Piedra();
        material[1][0] = new Piedra();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Piedra();
    }
    private void modoPicoMetal(){
        this.setMaterial();
        material[0][0] = new Metal();
        material[1][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Metal();
    }
    private void modoPicoFino(){
        this.setMaterial();
        material[0][0] = new Metal();
        material[0][1] = new Piedra();
        material[1][0] = new Metal();
        material[1][1] = new Madera();
        material[1][2] = new Madera();
        material[2][0] = new Metal();
    }


    public Herramienta fabricar(Material materialesDados[][]) {
        this.modoHachaMadera();
        if(this.comparar(materialesDados)){return new HachaMadera();}
        this.modoHachaPiedra();
        if(this.comparar(materialesDados)){return new HachaPiedra();}
        this.modoHachaMetal();
        if(this.comparar(materialesDados)){return new HachaMetal();}
        this.modoPicoMadera();
        if(this.comparar(materialesDados)){return new PicoMadera();}
        this.modoPicoPiedra();
        if(this.comparar(materialesDados)){return new PicoPiedra();}
        this.modoPicoMetal();
        if(this.comparar(materialesDados)){return new PicoMetal();}
        this.modoPicoFino();
        if(this.comparar(materialesDados)){return new PicoFino();}
        return null;
    }
}
