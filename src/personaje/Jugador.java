package personaje;

import excepciones.EspacioOcupadoException;
import excepciones.ExceptionFabricacionNoValida;
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
	//private ArrayList<Material> materialSeleccionado;

	public Jugador() {
		inventarioHerramientas = new InventarioHerramientas();
		inventarioMateriales = new InventarioMateriales();
		setEquipadoPorDefecto();
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	/*public void setMaterialSeleccionado(Class clase){
		materialSeleccionado = inventarioMateriales.getMateriales(clase);
	}*/

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
		} catch (ExceptionFabricacionNoValida e) {
			cancelarFabricacion();
		}
	}

	public void cancelarFabricacion() {
		for (Material material : fabricadorHerramientas.getMateriales())
			agregarMaterial(material);
	}

	public void agregarMaterialAlFabricador(Class tipoDeMaterial, int fila, int columna) {
		Material material;
		try {
			material = inventarioMateriales.quitar(tipoDeMaterial);
		} catch (NoHayMaterialException e) {
			return;
		}
		try {
			fabricadorHerramientas.agregar( material, fila, columna );
		} catch (EspacioOcupadoException e) {
			agregarMaterial(material);
		}
	}

	/*public void ubicarMaterial(int posicion1, int posicion2) throws EspacioOcupadoException {
		Material materialAUbicar = materialSeleccionado.remove(0);
		fabricadorHerramientas.agregar(materialAUbicar,posicion1,posicion2);
	}*/

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
		return fabricadorHerramientas;  //TODO ver
	}
	
	/*public ArrayList<Material> getMaterialSeleccionado() {
		return materialSeleccionado;
	}*/
}
