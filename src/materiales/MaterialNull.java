package materiales;

import herramientas.Herramienta;

public class MaterialNull extends Material {
    private static MaterialNull primeraInstancia = null;
    static final int DURABILIDAD_PERMANENTE = 999999;
    
    private MaterialNull() {
        super(DURABILIDAD_PERMANENTE);
    }

    public static MaterialNull getInstancia(){
        if(primeraInstancia == null){
            primeraInstancia = new MaterialNull();
            return primeraInstancia;
        }
        return primeraInstancia;
    }

    @Override
    public void desgastarCon(Herramienta herramienta) {

    }
}
