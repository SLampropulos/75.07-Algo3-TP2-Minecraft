package PersonajeTest;

import Herramientas.Herramienta;
import Materiales.Madera;
import Materiales.Material;
import Personaje.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JugadorTest {

	@Test
	void personajeSeCreaAdecuadamente() {
		Jugador jugador = new Jugador();
		Herramienta hacha = jugador.getEquipado();
		assertTrue(hacha != null);
	}

	@Test
	void personajeConHachaDeMaderaDesgastaMadera() {  
		Jugador jugador = new Jugador();
		Herramienta herramienta = jugador.getEquipado(); 
		Material madera = new Madera();

		float durabilidadAnterior = madera.getDurabilidad();
		madera.desgastarCon(herramienta);
		float durabilidadPosterior = madera.getDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}
}
