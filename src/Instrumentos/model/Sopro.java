package Instrumentos.model;

public class Sopro extends Instrumento {
    private float material;

    public Sopro(int id, int tipo, String instrumento, float valor, float material) {
        super(id, tipo, instrumento, valor);
        this.material = material;
    }

    public float getMaterial() {
        return material;
    }

    public void setMaterial(float material) {
        this.material = material;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Material do instrumento: " + this.material);
    }
}
