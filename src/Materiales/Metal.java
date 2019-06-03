package Materiales;


public class Metal extends Material {

    public Metal() {
        this.durabilidad = 50;
    }

    public void desgastarCon(Herramientas.PicoPiedra pico) {
        this.desgastar(pico.getDesgaste());
    }

}
