package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class HachaMaderaTest {

	int durabilidadEsperada = 100 - 2; // para inicial = 100 y DesgastadorLineal Fuerza = 2

	@Test
	public void HachaDeMaderaGolpeaMaderaYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMadera();
		Material madera = new Madera();

		hacha.golpear(madera);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMaderaGolpeaPiedraYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMadera();
		Material piedra = new Piedra();

		hacha.golpear(piedra);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMaderaGolpeaMetalYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMadera();
		Material metal = new Metal();

		hacha.golpear(metal);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}

	@Test
	public void HachaDeMaderaGolpeaDiamanteYSeDesgastaElHacha() {
		Herramienta hacha = new HachaMadera();
		Material diamante = new Diamante();

		hacha.golpear(diamante);

		assertEquals(durabilidadEsperada, hacha.obtenerDurabilidad());
	}
}
