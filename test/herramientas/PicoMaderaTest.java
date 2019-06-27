package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoMaderaTest {

	int durabilidadEsperada=98; //para inicial = 100 y DesgastadorLineal  Fuerza = 2
	
    @Test
    public void PicoDeMaderaGolpeaMaderaYSeDesgastaElPico() {
        Herramienta Pico = new PicoMadera();
    	Material madera = new Madera();
 
    	Pico.golpear(madera);

        assertEquals(durabilidadEsperada, Pico.getDurabilidad());
    }

    @Test
    public void PicoDeMaderaGolpeaPiedraYSeDesgastaElPico() {
        Herramienta Pico = new PicoMadera();
    	Material piedra = new Piedra();
 
    	Pico.golpear(piedra);

        assertEquals(durabilidadEsperada, Pico.getDurabilidad());
    }

    @Test
    public void PicoDeMaderaGolpeaMetalYSeDesgastaElPico() {
        Herramienta Pico = new PicoMadera();
    	Material metal = new Metal();
 
    	Pico.golpear(metal);

        assertEquals(durabilidadEsperada, Pico.getDurabilidad());
    }

    @Test
    public void PicoDeMaderaGolpeaDiamanteYSeDesgastaElPico() {
        Herramienta Pico = new PicoMadera();
    	Material diamante = new Diamante();
 
    	Pico.golpear(diamante);

        assertEquals(durabilidadEsperada, Pico.getDurabilidad());
    }
}
