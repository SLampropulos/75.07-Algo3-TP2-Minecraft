public class HachaPiedra extends Herramienta {

    protected HachaPiedra() {
        super(200, 5);
        desgastador = new DesgatadorLineal(fuerza,1);
    }
}
