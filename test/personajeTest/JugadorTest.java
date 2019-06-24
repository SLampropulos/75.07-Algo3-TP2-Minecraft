package personajeTest;

import herramientas.Herramienta;
import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import personaje.Jugador;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JugadorTest {

	@Test
	void personajeSeCreaAdecuadamente() {
		Jugador jugador = new Jugador();
		Herramienta hacha = jugador.obtenerHerramientaEquipada();
		assertTrue(hacha != null);
	}

	@Test
	void personajeConHachaDeMaderaDesgastaMadera() {  
		Jugador jugador = new Jugador();
		Herramienta herramienta = jugador.obtenerHerramientaEquipada(); 
		Material madera = new Madera();

		float durabilidadAnterior = madera.obtenerDurabilidad();
		madera.desgastarCon(herramienta);
		float durabilidadPosterior = madera.obtenerDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}

	/*@Test
	void personajeSeleccionaUnMaterial(){
		Jugador jugador = new Jugador();

		ArrayList<Material> materiales= jugador.getMaterialSeleccionado();

		assertTrue(materiales == null);
	}*/

	/*@Test
	void personajeSelecciona(){
		Jugador jugador = new Jugador();
		ArrayList<Material> materiales;
		jugador.agregarMaterial(new Madera());
		jugador.setMaterialSeleccionado(Madera.class);
		materiales = jugador.getMaterialSeleccionado();
		Material material = materiales.get(0);

		assertEquals(material.getClass(),Madera.class);
		assertEquals(materiales.size(),1);
	}*/

}
