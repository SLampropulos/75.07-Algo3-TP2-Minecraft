package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoPiedraTest {

	float durabilidadEsperada = (float) (200.0 - 4.0/1.5); // para inicial = 200 y DesgastadorLineal Fuerza = 4 (usa 4/1.5)

	@Test
	public void PicoDePiedraGolpeaMaderaYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material madera = new Madera();

		Pico.golpear(madera);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaPiedraYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material piedra = new Piedra();

		Pico.golpear(piedra);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaMetalYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material metal = new Metal();

		Pico.golpear(metal);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaDiamanteYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material diamante = new Diamante();

		Pico.golpear(diamante);

		assertEquals(durabilidadEsperada, Pico.getDurabilidad());
	}
}
