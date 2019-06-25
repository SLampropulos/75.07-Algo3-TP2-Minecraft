package personajeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import herramientas.PicoMadera;
import materiales.Madera;
import personaje.Jugador;

class JugadorConFabricadorHerramientasTest {

	@Test
	void JugadorfabricaUnPicoDeMadera() {
		Jugador jugador = new Jugador();

		for (int i = 0; i < 5; i++)
			jugador.agregarMaterial(new Madera());

		jugador.seleccionarMaterial(Madera.class);
		jugador.agregarMaterialSeleccionadoAlFabricador(0, 0);

		jugador.seleccionarMaterial(Madera.class);
		jugador.agregarMaterialSeleccionadoAlFabricador(1, 0);

		jugador.seleccionarMaterial(Madera.class);
		jugador.agregarMaterialSeleccionadoAlFabricador(2, 0);

		jugador.seleccionarMaterial(Madera.class);
		jugador.agregarMaterialSeleccionadoAlFabricador(1, 1);

		jugador.seleccionarMaterial(Madera.class);
		jugador.agregarMaterialSeleccionadoAlFabricador(1, 2);

		int cantidadInicial = jugador.getInventarioHerramientas().cantidadDeHerramientas();


		jugador.fabricarHerramienta();

		
		assertEquals(cantidadInicial + 1, jugador.getInventarioHerramientas().cantidadDeHerramientas());
		assertEquals(PicoMadera.class, jugador.getInventarioHerramientas().obtenerHerramienta(1).getClass());
		assertEquals(0, jugador.cantidadDeMadera());
	}
}
