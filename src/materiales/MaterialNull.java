package materiales;

import herramientas.Herramienta;

public class MaterialNull extends Material {
    private static MaterialNull primeraInstancia = null;

    private MaterialNull() {
        super(999999);
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
