package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class HachaPiedraTest {

	int durabilidadEsperada = 200 - 5; // para inicial = 200 y DesgastadorLineal Fuerza = 5

	@Test
	public void HachaDePiedraGolpeaMaderaYSeDesgastaElHacha() {
		Herramienta hacha = new HachaPiedra();
		Material madera = new Madera();

		hacha.golpear(madera);

		assertEquals(durabilidadEsperada, hacha.getDurabilidad());
	}

	@Test
	public void HachaDePiedraGolpeaPiedraYSeDesgastaElHacha() {
		Herramienta hacha = new HachaPiedra();
		Material piedra = new Piedra();

		hacha.golpear(piedra);

		assertEquals(durabilidadEsperada, hacha.getDurabilidad());
	}

	@Test
	public void HachaDePiedraGolpeaMetalYSeDesgastaElHacha() {
		Herramienta hacha = new HachaPiedra();
		Material metal = new Metal();

		hacha.golpear(metal);

		assertEquals(durabilidadEsperada, hacha.getDurabilidad());
	}

	@Test
	public void HachaDePiedraGolpeaDiamanteYSeDesgastaElHacha() {
		Herramienta hacha = new HachaPiedra();
		Material diamante = new Diamante();

		hacha.golpear(diamante);

		assertEquals(durabilidadEsperada, hacha.getDurabilidad());
	}
}
