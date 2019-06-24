package personajeTest;

import materiales.*;
import org.junit.jupiter.api.Test;
import personaje.patronesConstruccion.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatronesCotruccionTest {

    private void setMaterialATestear(Material[][] material){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                material[i][j] = MaterialNull.obtenerInstancia();
            }
        }
    }

    @Test
    void patronDicenioHachaMaderaCreadoCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronHachaMadera();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Madera();
        materialTest[0][1] = new Madera();
        materialTest[1][0] = new Madera();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }

    @Test
    void patronDicenioHachaPiedraCreadoCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronHachaPiedra();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Piedra();
        materialTest[0][1] = new Piedra();
        materialTest[1][0] = new Piedra();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }

    @Test
    void patronDicenioHachaMetalCreadoCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronHachaMetal();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Metal();
        materialTest[0][1] = new Metal();
        materialTest[1][0] = new Metal();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }

    @Test
    void patronDicenioPicoMaderaSeCreaCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronPicoMadera();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Madera();
        materialTest[1][0] = new Madera();
        materialTest[2][0] = new Madera();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }
    @Test
    void patronDicenioPicoPiedraSeCreaCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronPicoPiedra();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Piedra();
        materialTest[1][0] = new Piedra();
        materialTest[2][0] = new Piedra();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }

    @Test
    void patronDicenioPicoMetalSeCreaCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronPicoMetal();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Metal();
        materialTest[1][0] = new Metal();
        materialTest[2][0] = new Metal();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }

    @Test
    void patronDicenioPicoFinoSecreaCorrectamente(){
        PatronConstruccion patronesConstruccion = new PatronPicoFino();
        Material[][] materialTest = new Material[3][3];
        setMaterialATestear(materialTest);
        materialTest[0][0] = new Metal();
        materialTest[1][0] = new Metal();
        materialTest[2][0] = new Metal();
        materialTest[1][1] = new Madera();
        materialTest[1][2] = new Madera();
        materialTest[0][1] = new Piedra();

        assertTrue( patronesConstruccion.comparar(materialTest));
    }
}