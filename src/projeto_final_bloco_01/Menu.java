package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import Instrumentos.controller.InstrumentosController;
import Instrumentos.model.Corda;
import Instrumentos.model.Sopro;

public class Menu {

    public static void main(String[] args) {
        int op, id, tipo, cordas;
        String nome, material;
        float valor;

        InstrumentosController instrumentos = new InstrumentosController();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("******************************************************");
            System.out.println("            1 - Cadastrar instrumento                 ");
            System.out.println("            2 - Listar todos os instrumentos          ");
            System.out.println("            3 - Consultar instrumento                 ");
            System.out.println("            4 - Atualizar instrumento                ");
            System.out.println("            5 - Deletar instrumento                   ");
            System.out.println("            6 - Sair                                  ");
            System.out.println("******************************************************");

            try {
                op = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                input.nextLine();
                op = 0;
            }

            if (op == 6) {
                System.out.println("\nObrigado por utilizar o serviço!");
                input.close();
                System.exit(0);
            }

            switch (op) {
                case 1:
                    System.out.println("\nCadastrar Instrumento: ");
                    System.out.println("\nDigite o nome do instrumento: ");
                    input.nextLine(); // Consumir a nova linha pendente
                    nome = input.nextLine();
                    System.out.println("Digite o valor do instrumento: ");
                    valor = input.nextFloat();
                    input.nextLine(); // Consumir a nova linha pendente
                    do {
                        System.out.println("Digite o Tipo de instrumento (1- Corda ou 2- Sopro): ");
                        tipo = input.nextInt();
                    } while (tipo < 1 || tipo > 2);

                    switch (tipo) {
                        case 1:
                            System.out.println("Digite o numero de cordas: ");
                            cordas = input.nextInt();
                            instrumentos.cadastrar(new Corda(instrumentos.gerarId(), tipo, nome, valor, cordas));
                            input.nextLine(); // Consumir a nova linha pendente
                            break;

                        case 2:
                            System.out.println("Digite o Material do instrumento: ");
                            input.nextLine(); // Consumir a nova linha pendente
                            material = input.nextLine();
                            instrumentos.cadastrar(new Sopro(instrumentos.gerarId(), tipo, nome, valor, material));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nListar instrumentos");
                    instrumentos.listarTodos();
                    break;

                case 3:
                    System.out.println("\nConsultar instrumento");
                    System.out.println("\nDigite o id do instrumento: ");
                    id = input.nextInt();
                    instrumentos.procurarPorId(id);
                    break;

                case 4:
                    System.out.println("\nAtualizar instrumento");
                    System.out.println("Digite o ID do instrumento: ");
                    id = input.nextInt();
                    var buscaInstrumento = instrumentos.buscarNaCollection(id);
                    if (buscaInstrumento != null) {
                        tipo = buscaInstrumento.getTipo();

                        System.out.println("Digite o nome do instrumento: ");
                        input.nextLine(); // Consumir a nova linha pendente
                        nome = input.nextLine();
                        System.out.println("Digite o valor do instrumento: ");
                        valor = input.nextFloat();

                        switch (tipo) {
                            case 1:
                                System.out.println("Digite o numero de cordas: ");
                                cordas = input.nextInt();
                                break;

                            case 2:
                                System.out.println("Digite o material do instrumento: ");
                                input.nextLine(); // Consumir a nova linha pendente
                                material = input.nextLine();
                                break;
                        }
                    } else {
                        System.out.println("Instrumento não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("\nDeletar instrumento");
                    System.out.println("Digite o id do instrumento: ");
                    id = input.nextInt();

                    instrumentos.deletar(id);
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }
        }
    }
}
