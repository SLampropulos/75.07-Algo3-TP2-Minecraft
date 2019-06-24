package herramientas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import materiales.Piedra;

class PicoPiedraTest {

	int durabilidadEsperada = (int) (200 - 2/*((int) 4/1.5)*/); // para inicial = 200 y DesgastadorLineal Fuerza = 4 (usa 4/1.5)

	@Test
	public void PicoDePiedraGolpeaMaderaYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material madera = new Madera();

		Pico.golpear(madera);

		assertEquals(durabilidadEsperada, Pico.obtenerDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaPiedraYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material piedra = new Piedra();

		Pico.golpear(piedra);

		assertEquals(durabilidadEsperada, Pico.obtenerDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaMetalYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material metal = new Metal();

		Pico.golpear(metal);

		assertEquals(durabilidadEsperada, Pico.obtenerDurabilidad());
	}

	@Test
	public void PicoDePiedraGolpeaDiamanteYSeDesgastaElPico() {
		Herramienta Pico = new PicoPiedra();
		Material diamante = new Diamante();

		Pico.golpear(diamante);

		assertEquals(durabilidadEsperada, Pico.obtenerDurabilidad());
	}
}
