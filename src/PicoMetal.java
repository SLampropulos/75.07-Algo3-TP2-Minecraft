public class PicoMetal extends Herramienta{

    protected PicoMetal() {
        super(400, 12);
        desgastador = new DesgatadorPorUsos(10,400);
    }
}
