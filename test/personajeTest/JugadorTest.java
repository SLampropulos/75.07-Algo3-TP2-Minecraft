package personajeTest;

import herramientas.Herramienta;
import herramientas.PicoPiedra;
import materiales.Madera;
import materiales.Material;
import materiales.MaterialNull;
import personaje.FabricadorHerramientas;
import personaje.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

		int durabilidadAnterior = madera.getDurabilidad();
		madera.desgastarCon(herramienta);
		int durabilidadPosterior = madera.getDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}

	@Test
	void jugadorTrataDeAgregarMaterialYAgregaMaderaPorDefecto(){
		Jugador jugador = new Jugador();
		jugador.agregarMaterial(new Madera());
		jugador.agregarMaterialSeleccionadoAlFabricador(0,0);
		assertEquals(0,jugador.cantidadDeMadera());
		assertEquals(0,jugador.cantidadDePiedra());
		assertEquals(0,jugador.cantidadDeMetal());
		assertEquals(0,jugador.cantidadDeDiamante());

	}

	@Test
	void jugadorAniadeMaterialesAlFabricadorSeDescuentaDelInventario(){
		Jugador jugador = new Jugador();
		for (int i = 0; i < 3; i++) {
			jugador.agregarMaterial(new Madera());
		}
		jugador.seleccionarMaterial(Madera.class);
		for (int i = 0; i < 3; i++) {
			jugador.agregarMaterialSeleccionadoAlFabricador(i,i);
		}

		assertEquals(0,jugador.cantidadDeMadera());
	}

	@Test
	void jugadorSeCreaTrataDeAgregarMaterialAlFabricadorSinTenerMadera(){
		Jugador jugador = new Jugador();
		FabricadorHerramientas fabricadorHerramientas = jugador.getFabricadorHerramientas();
		jugador.agregarMaterialSeleccionadoAlFabricador(0,0);

		Material material = fabricadorHerramientas.obtener(0,0);

		assertEquals(material, MaterialNull.getInstancia());
	}

	@Test
	void juagadorCambiaHerraminetaEquipada(){
		Jugador jugador = new Jugador();
		Herramienta herramienta = new PicoPiedra();
		jugador.agregarHerramienta(herramienta);
		jugador.setEquipable(1);

		Herramienta equipoActual = jugador.getEquipado();

		assertEquals(herramienta, equipoActual);
	}

	@Test
	void jugadorAgregaMaterialesAlFabricadorYLoCanceConsigueSusMaterialesOtraVez(){
		Jugador jugador = new Jugador();
		for (int i = 0; i < 3; i++) {
			jugador.agregarMaterial(new Madera());
		}
		jugador.seleccionarMaterial(Madera.class);
		for (int i = 0; i < 3; i++) {
			jugador.agregarMaterialSeleccionadoAlFabricador(i,i);
		}
		jugador.cancelarFabricacion();

		assertEquals(3,jugador.cantidadDeMadera());
	}


}
