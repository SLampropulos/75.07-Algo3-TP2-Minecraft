package PersonajeTest;

import Herramientas.HachaMadera;
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
	void personajeConHachaDeMaderaDesgastaMadera_NO_PASA() {  
		Jugador jugador = new Jugador();
		Herramienta herramienta = jugador.getEquipado(); 
		Material madera = new Madera();

		float durabilidadAnterior = madera.getDurabilidad();
		madera.desgastarCon(herramienta);
		float durabilidadPosterior = madera.getDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}

	@Test
	void personajeConHachaDeMaderaDesgastaMadera_PASA() {  // se fijan cosas que no se pueden en el juego  
		Jugador jugador = new Jugador();
		HachaMadera herramienta = (HachaMadera)jugador.getEquipado();  //debi castear y fijar tipo HachaMadera (tendria que usar material)
		Madera madera = new Madera(); //tendria que funcionar para cualquier material

		float durabilidadAnterior = madera.getDurabilidad();
		madera.desgastarCon(herramienta);
		float durabilidadPosterior = madera.getDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}
}
