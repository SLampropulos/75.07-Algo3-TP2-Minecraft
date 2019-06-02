public abstract class Material {

    protected float durabilidad;

    public float getDurabilidad() {
        return this.durabilidad;
    }

    public void desgastarCon(Herramienta herramienta) {}

    protected void desgastar(float desgaste) {
        this.durabilidad -= desgaste;
    }

}
