package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoMetalTest {

	float durabilidadEsperada = 400; // no disminuye la durabilidad pero se rompe al 12

	@Test
	public void PicoDeMetalGolpeaMaderaYSeDesgastaElPico() {
		Herramienta Pico = new PicoMetal();
		Material madera = new Madera();

		Pico.golpear(madera);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDeMetalGolpeaPiedraYSeDesgastaElPico() {
		Herramienta Pico = new PicoMetal();
		Material piedra = new Piedra();

		Pico.golpear(piedra);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDeMetalGolpeaMetalYSeDesgastaElPico() {
		Herramienta Pico = new PicoMetal();
		Material metal = new Metal();

		Pico.golpear(metal);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDeMetalGolpeaDiamanteYSeDesgastaElPico() {
		Herramienta Pico = new PicoMetal();
		Material diamante = new Diamante();

		Pico.golpear(diamante);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}
}
