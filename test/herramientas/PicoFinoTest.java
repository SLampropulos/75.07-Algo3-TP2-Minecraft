package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoFinoTest {

	int durabilidadEsperada1 = (int) (1000 * .9); // para inicial = 1000 y DesgastadorPorcentual
	int durabilidadEsperada2 = (int) (1000 * .9 *.9);

	@Test
	public void PicoFinoGolpeaMaderaYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material madera = new Madera();

		Pico.golpear(madera);
		assertEquals(durabilidadEsperada1, Pico.obtenerDurabilidad());

		Pico.golpear(madera);
		assertEquals(durabilidadEsperada2, Pico.obtenerDurabilidad());
}

	@Test
	public void PicoFinoGolpeaPiedraYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material piedra = new Piedra();

		Pico.golpear(piedra);
		assertEquals(durabilidadEsperada1, Pico.obtenerDurabilidad());

		Pico.golpear(piedra);
		assertEquals(durabilidadEsperada2, Pico.obtenerDurabilidad());
	}

	@Test
	public void PicoFinoGolpeaMetalYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material metal = new Metal();

		Pico.golpear(metal);
		assertEquals(durabilidadEsperada1, Pico.obtenerDurabilidad());

		Pico.golpear(metal);
		assertEquals(durabilidadEsperada2, Pico.obtenerDurabilidad());
	}

	@Test
	public void PicoFinoGolpeaDiamanteYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material diamante = new Diamante();

		Pico.golpear(diamante);
		assertEquals(durabilidadEsperada1, Pico.obtenerDurabilidad());

		Pico.golpear(diamante);
		assertEquals(durabilidadEsperada2, Pico.obtenerDurabilidad());
	}
}
