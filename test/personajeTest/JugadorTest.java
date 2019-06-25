package personajeTest;

import excepciones.MaterialNoSeleccionadoException;
import herramientas.Herramienta;
import materiales.Madera;
import materiales.Material;
import materiales.MaterialNull;
import personaje.FabricadorHerramientas;
import personaje.Jugador;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

		float durabilidadAnterior = madera.getDurabilidad();
		madera.desgastarCon(herramienta);
		float durabilidadPosterior = madera.getDurabilidad();

		assertTrue(durabilidadPosterior < durabilidadAnterior);
	}

	@Test
	void jugadorTrataDeAgregarMaterialSinTenerAlgunoSeleccionadoNoPasaNada(){
		Jugador jugador = new Jugador();
		jugador.agregarMaterial(new Madera());
		jugador.agregarMaterialSeleccionadoAlFabricador(0,0);
		assertEquals(1,jugador.cantidadDeMadera());
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
	void jugadorSeCreaTrataDeAgregarMaterialAlFabricadorSinIndicarMaterialTiraExcepcion(){
		Jugador jugador = new Jugador();
		FabricadorHerramientas fabricadorHerramientas = jugador.getFabricadorHerramientas();
		jugador.agregarMaterial(new Madera());
		jugador.agregarMaterialSeleccionadoAlFabricador(0,0);

		Material material = fabricadorHerramientas.obtener(0,0);

		assertEquals(material, MaterialNull.getInstancia());
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
