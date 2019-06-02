public class PicoMadera extends Herramienta {

    protected PicoMadera() {
        super(100, 2);
        desgastador = new DesgatadorLineal(fuerza,1);
    }
}
