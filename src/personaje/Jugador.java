package personaje;

import excepciones.EspacioOcupadoExcepcion;
import excepciones.FabricacionNoValidaExcepcion;
import excepciones.NoHayMaterialExcepcion;
import excepciones.NoHayHerramientaExcepcion;
import herramientas.Herramienta;
import juego.Mapa;
import materiales.Material;

public class Jugador {

	//Definición de constantes
	static final int HERRAMIENTA_INICIAL = 0;
	
	//Declaración de variables
	private Mapa mapa;
	FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	private InventarioHerramientas inventarioHerramientas;
	private InventarioMateriales inventarioMateriales;
	private Herramienta herramientaEquipada;

	//Constructor
	public Jugador() {
		inventarioHerramientas = new InventarioHerramientas();
		inventarioMateriales = new InventarioMateriales();
		equiparHerramientasPorDefecto();
	}

	//Post: Se equipan herramientas iniciales
	public void equiparHerramientasPorDefecto() {
		herramientaEquipada = inventarioHerramientas.obtenerHerramienta(HERRAMIENTA_INICIAL);
	}
	
	//Post: Se busca una herramienta disponible para equipar al jugador
	public void equiparHerramientaDisponible() throws NoHayHerramientaExcepcion {
		herramientaEquipada = inventarioHerramientas.obtenerHerramienta(HERRAMIENTA_INICIAL);
		if ( herramientaEquipada.obtenerDurabilidad() < 0 ) throw new NoHayHerramientaExcepcion();
	}
	
	//Post: Se inicializa el mapa
	public void declararMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	//Post: Se obtiene la herramienta equipada
	public Herramienta obtenerHerramientaEquipada() {
		return herramientaEquipada;
	}

	//Post: Golpea. Si la herramienta se rompe, busca una disponible y la equipa
	public void golpear(Material material) throws NoHayHerramientaExcepcion {
		herramientaEquipada.golpear(material);
		if (herramientaEquipada.obtenerDurabilidad() <= 0) {
			inventarioHerramientas.remove(herramientaEquipada);
			equiparHerramientaDisponible();
		}
	}

	//Post: Se agrega un material al inventario
	public void agregarMaterial(Material material) {
		inventarioMateriales.agregar(material);
	}

	//Ppst: Se agrega una herramienta al inventario
	public void agregarHerramienta(Herramienta herramienta) {
		inventarioHerramientas.agregar(herramienta);
	}
	
	//Post: El jugador se desplaza
	public void izquierda() throws NoHayHerramientaExcepcion {
		mapa.izquierda();
	}

	//Post: El jugador se desplaza
	public void derecha() throws NoHayHerramientaExcepcion {
		mapa.derecha();
	}

	//Post: El jugador se desplaza
	public void arriba() throws NoHayHerramientaExcepcion {
		mapa.arriba();
	}

	//Post: El jugador se desplaza
	public void abajo() throws NoHayHerramientaExcepcion {
		mapa.abajo();
	}

}
