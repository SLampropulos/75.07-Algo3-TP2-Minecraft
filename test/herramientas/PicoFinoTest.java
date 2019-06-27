package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoFinoTest {

	float durabilidadEsperada1 = (float) (1000 * .1); // para inicial = 1000 y DesgastadorPorcentual
	float durabilidadEsperada2 = (float) (1000 * .1 *.1);
	float durabilidadEsperada3 = (float) (1000 * .1 * .1 * .1);
	float durabilidadEsperada4 = 0;

	@Test
	public void PicoFinoGolpeaMaderaYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material madera = new Madera();

		Pico.golpear(madera);
		assertEquals(durabilidadEsperada1, Pico.getDurabilidad());

		Pico.golpear(madera);
		assertEquals(durabilidadEsperada2, Pico.getDurabilidad());
		
		Pico.golpear(madera);
		assertEquals(durabilidadEsperada3, Pico.getDurabilidad());
		
		Pico.golpear(madera);
		assertEquals(durabilidadEsperada4, Pico.getDurabilidad());
		
}

	@Test
	public void PicoFinoGolpeaPiedraYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material piedra = new Piedra();

		Pico.golpear(piedra);
		assertEquals(durabilidadEsperada1, Pico.getDurabilidad());

		Pico.golpear(piedra);
		assertEquals(durabilidadEsperada2, Pico.getDurabilidad());
	}

	@Test
	public void PicoFinoGolpeaMetalYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material metal = new Metal();

		Pico.golpear(metal);
		assertEquals(durabilidadEsperada1, Pico.getDurabilidad());

		Pico.golpear(metal);
		assertEquals(durabilidadEsperada2, Pico.getDurabilidad());
	}

	@Test
	public void PicoFinoGolpeaDiamanteYSeDesgastaElPico() {
		Herramienta Pico = new PicoFino();
		Material diamante = new Diamante();

		Pico.golpear(diamante);
		assertEquals(durabilidadEsperada1, Pico.getDurabilidad());

		Pico.golpear(diamante);
		assertEquals(durabilidadEsperada2, Pico.getDurabilidad());
	}
}
