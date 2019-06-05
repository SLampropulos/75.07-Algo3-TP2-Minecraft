package Materiales;

static final int DURABILIDAD_METAL 50;

public class Metal extends Material {

    public Metal() {
        this.durabilidad = DURABILIDAD_METAL;
    }

    public void desgastarCon(Herramientas.PicoPiedra pico) {
        this.desgastar(pico.obtenerDesgaste());
    }

}
