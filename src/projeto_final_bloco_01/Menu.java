package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int op, id, tipo;
        String instrumento, cordas, sopro;
        float valor;

        while (true) {
            System.out.println("******************************************************");
            System.out.println("            1 - Cadastrar instrumento                 ");
            System.out.println("            2 - Listar todos os instrumentos          ");
            System.out.println("            3 - Consultar instrumento                 ");
            System.out.println("            4 - Atualizar instrumento             	  ");
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
                System.out.println("\nObrigado por ultilizar o serviço!");
                input.nextLine();
                op = 0;
            }

            switch (op) {
                case 1:
                    System.out.println("\n Cadastrar Instrumento: ");
                    instrumento = input.nextLine();
                    break;

                case 2:
                    System.out.println("\n Listar instrumentos");
                    break;

                case 3:
                    System.out.println("\n Consultar instrumento");
                    break;

                case 4:
                    System.out.println("\n Atualizar instrumento");
                    break;

                case 5:
                    System.out.println("\n Deletar instrumento");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
                    break;
            }
        }
    }
}

