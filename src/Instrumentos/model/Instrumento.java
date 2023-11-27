package Instrumentos.model;

public class Instrumento {
    private int id;
    private int tipo;
    private float valor;
    private String instrumento;

    public Instrumento(int id, int tipo, String instrumento, float valor) {
        this.id = id;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void visualizar() {
        String tipoStr = (this.tipo == 1) ? "Corda" : "Sopro";

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do produto: ");
        System.out.println("***********************************************************");
        System.out.println("Número do produto: " + this.id);
        System.out.println("Tipo do produto: " + tipoStr);
        System.out.println("Preço do produto: " + this.valor);
    }
}
