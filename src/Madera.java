public class Madera extends Material {

    public Madera() {
        this.durabilidad = 10;
    }

    public void desgastarCon(HachaMadera hacha) {
        this.desgastar(hacha.getDesgaste());
    }

    public void desgastarCon(HachaPiedra hacha) {
        this.desgastar(hacha.getDesgaste());
    }

    /*public void desgastarCon(HachaMetal hacha) {
        this.desgastar(hacha.getDesgaste());
    }*/

}
