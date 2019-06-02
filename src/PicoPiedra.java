public class PicoPiedra extends Herramienta {
    protected PicoPiedra() {
        super(200, 4);
        desgastador = new DesgatadorLineal(fuerza, 15,10);
    }
}
