package Instrumentos.model;

public class Corda extends Instrumento {
    private int cordas;

    public Corda(int id, int tipo, String instrumento, float valor, int cordas) {
        super(id, tipo, instrumento, valor);
        this.cordas = cordas;
    }

    public int getCordas() {
        return cordas;
    }

    public void setCordas(int cordas) {
        this.cordas = cordas;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Numero de cordas: " + this.cordas);
    }
}
