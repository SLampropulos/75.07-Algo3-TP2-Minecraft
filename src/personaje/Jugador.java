package personaje;

import excepciones.EspacioOcupadoException;
import excepciones.FabricacionNoValidaException;
import excepciones.MaterialNoSeleccionadoException;
import excepciones.NoHayMaterialException;
import herramientas.Herramienta;
import juego.Mapa;
import materiales.Material;

public class Jugador {

	private Mapa mapa;
	private FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	private InventarioHerramientas inventarioHerramientas;
	private InventarioMateriales inventarioMateriales;
	private Herramienta equipado;

	public Jugador() {
		inventarioHerramientas = new InventarioHerramientas();
		inventarioMateriales = new InventarioMateriales();
		setEquipadoPorDefecto();
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void seleccionarMaterial(Class clase){
		inventarioMateriales.seleccionarMaterial(clase);
	}

	public Herramienta getEquipado() {
		return equipado;
	}

	private void setEquipadoPorDefecto() {
		equipado = inventarioHerramientas.obtenerHerramienta(0);
	}

	public void golpear(Material material) {
		equipado.golpear(material);
		if (equipado.getDurabilidad() <= 0) {
			inventarioHerramientas.remove(equipado);
			setEquipadoPorDefecto();
		}
	}

	public void agregarMaterial(Material material) {
		inventarioMateriales.agregar(material);
	}

	public void agregarHerramienta(Herramienta herramienta) {
		inventarioHerramientas.agregar(herramienta);
	}

	public void fabricarHerramienta() {
		try {
			inventarioHerramientas.agregar( fabricadorHerramientas.fabricar() );
		} catch (FabricacionNoValidaException e) {
			cancelarFabricacion();
		}
	}

	public void cancelarFabricacion() {
		for (Material material : fabricadorHerramientas.getMateriales())
			agregarMaterial(material);
	}

	public void agregarMaterialSeleccionadoAlFabricador(int fila, int columna) {
		Material material;
		try {
			material = inventarioMateriales.quitarSeleccionado();
		} catch (NoHayMaterialException e) {
			return;
		} catch (MaterialNoSeleccionadoException e) {
			return;
		}
		try {
			fabricadorHerramientas.agregar( material, fila, columna );
		} catch (EspacioOcupadoException e) {
			agregarMaterial(material);
		}
	}
	
	public void izquierda() {
		mapa.izquierda();
	}

	public void derecha() {
		mapa.derecha();
	}

	public void arriba() {
		mapa.arriba();
	}

	public void abajo() {
		mapa.abajo();
	}

	public int cantidadDeMadera() {
		return inventarioMateriales.cantidadDeMadera();
	}
	
	public int cantidadDePiedra() {
		return inventarioMateriales.cantidadDePiedra();
	}
	
	public int cantidadDeMetal() {
		return inventarioMateriales.cantidadDeMetal();
	}
	
	public int cantidadDeDiamante() {
		return inventarioMateriales.cantidadDeDiamante();
	}
	

	public FabricadorHerramientas getFabricadorHerramientas() {
		return fabricadorHerramientas;
	}

	public InventarioHerramientas getInventarioHerramientas() {
		return inventarioHerramientas;
	}
	
	public Class<?> materialSeleccionado() {
		return inventarioMateriales.materialSeleccionado();
	}

	public void setEquipable(int numeroHerramienta) {
		equipado = inventarioHerramientas.obtenerHerramienta(numeroHerramienta);
	}
}
