package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class HachaMetalTest {

	int durabilidadEsperada = 400 - 10 / 2; // para inicial = 400 y DesgastadorLineal Fuerza = 10 (usa 10/2)

	@Test
	public void HachaDeMetalGolpeaMaderaYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMetal();
		Material madera = new Madera();

		hacha.golpear(madera);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMetalGolpeaPiedraYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMetal();
		Material piedra = new Piedra();

		hacha.golpear(piedra);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMetalGolpeaMetalYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMetal();
		Material metal = new Metal();

		hacha.golpear(metal);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMetalGolpeaDiamanteYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMetal();
		Material diamante = new Diamante();

		hacha.golpear(diamante);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}
}
