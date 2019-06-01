public class HachaMadera extends Herramienta{

    public HachaMadera(){
        super(100,2);
        desgastador = new DesgatadorLineal(fuerza,1);
    }

}
