package pe.pucp.edu.telecom.util;

import pe.pucp.edu.telecom.entity.Usuario;

import java.util.Scanner;


public class Opciones {
    private static Scanner sc = new Scanner(System.in);

    public static void opcion1() {

    }

    public static void opcion2() {
        Usuario usuario = new Usuario();
        System.out.println("Ingrese los datos a continuación: \n");

        boolean flag = true;
        Double opt;
        while (flag) {

            System.out.println("Código PUCP:");

            String numStr = sc.nextLine();

            try {
                opt = Double.parseDouble(numStr);
                if (opt <= 99999999) {
                    usuario.setCodigopucp(opt);
                    flag = false;
                } else {
                    System.out.println("Ingrese un número válido (8 dígitos).");
                }

            } catch (NumberFormatException e) {
                System.out.println("¡POR FAVOR, INGRESE UN NÚMERO!\n");

            }
        }
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        usuario.setNombre(nombre);

        System.out.println("Apellido:");
        String apellido = sc.nextLine();
        usuario.setApellido(apellido);

        System.out.println("Teléfono:");
        String comodin = sc.nextLine();
        int telefono = Integer.parseInt(comodin);
        usuario.setTelefono(telefono);

        System.out.println("Anexo");
        String comodin2 = sc.nextLine();
        int anexo = Integer.parseInt(comodin2);
        usuario.setAnexo(anexo);

        boolean flag2=true;
        while (flag2){
            System.out.println("Departamento:");
            String comodin3 = sc.nextLine();
            if(comodin3.equalsIgnoreCase("ING") || comodin3.equalsIgnoreCase("CIE")|| comodin3.equalsIgnoreCase("LET")){
                usuario.setDepartamento(comodin3);
                flag2=false;
            }else {
                System.out.println("Dato incorrecto, ingrese nuevamente.");
            }
        }


    }

    public static void opcion3() {

    }

    public static void opcion4() {

    }
}
