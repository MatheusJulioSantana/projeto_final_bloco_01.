package Instrumentos.model;

public class Instrumento {
    private int id;
    private int tipo;
    private float valor;
    private String nome;
    

    public Instrumento(int id, int tipo, String nome, float valor) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
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
        return nome;
    }

    public void setInstrumento(String nome) {
        this.nome = nome;
    }

    public void visualizar() {
    	
    	String tipo ="";
    	switch(this.tipo) {
		case 1:
			tipo = "Corda";
		break;
		case 2:
			tipo = "Sopro";
		break;
		}

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do produto: ");
        System.out.println("***********************************************************");
        System.out.println("Nome do instrumento: " + this.nome);
        System.out.println("id do instrumento: " + this.id);
        System.out.println("Tipo do instrumento: " + tipo);
        System.out.println("Preço do instrumento: " + this.valor);
    }
}
