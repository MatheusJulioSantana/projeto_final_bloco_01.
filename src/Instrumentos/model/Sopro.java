package Instrumentos.model;

public class Sopro extends Instrumento {
    private String material;

    public Sopro(int id, int tipo, String instrumento, float valor, String material) {
        super(id, tipo, instrumento, valor);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Material do instrumento: " + this.material);
    }
}
