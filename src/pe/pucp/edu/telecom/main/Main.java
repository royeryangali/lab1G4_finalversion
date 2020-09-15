package pe.pucp.edu.telecom.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String menu = "*****PUCPABook******" +
                "\n1. Leer Datos" +
                "\n2. Agregar Usuario" +
                "\n3. Buscar Usuario" +
                "\n4. Escribir Usuario" +
                "\n-Opción: ";


        Scanner sc = new Scanner(System.in);
        int opt;
        while (true) {

            System.out.print(menu);

            String numStr = sc.nextLine();

            try {
                opt = Integer.parseInt(numStr);

            } catch (NumberFormatException e) {
                System.out.println("¡POR FAVOR, INGRESE UN NÚMERO!\n");
                continue;
            }
            switch (opt) {
                case 1:

                    break;
                case 2:
                    System.out.println("Por favor, ingrese lo datos solicitados: \n");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("¡OPCIÓN ERRÓNEA!\n");
                    break;
            }
        }
    }
    }
