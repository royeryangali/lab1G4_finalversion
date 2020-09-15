package pe.pucp.edu.telecom.util;

import pe.pucp.edu.telecom.entity.Usuario;
import pe.pucp.edu.telecom.manager.DirectorioTelefonico;

import java.util.*;


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


        boolean flag3 = true;
        int opt3;
        while (flag3) {

            System.out.println("Anexo");

            String comodin2 = sc.nextLine();


            try {
                opt3 = Integer.parseInt(comodin2);

                usuario.setAnexo(opt3);
                flag3 = false;

            } catch (NumberFormatException e) {
                System.out.println("¡POR FAVOR, INGRESE UN NÚMERO!\n");

            }
        }


        boolean flag4 = true;
        int opt4;
        while (flag4) {

            System.out.println("Teléfono:");
            String comodin4 = sc.nextLine();


            try {
                opt4 = Integer.parseInt(comodin4);
                usuario.setTelefono(opt4);
                flag4 = false;

            } catch (NumberFormatException e) {
                System.out.println("¡POR FAVOR, INGRESE UN NÚMERO!\n");

            }
        }


        boolean flag2 = true;
        while (flag2) {
            System.out.println("Departamento:");
            String comodin3 = sc.nextLine();
            if (comodin3.equalsIgnoreCase("ING") || comodin3.equalsIgnoreCase("CIE") || comodin3.equalsIgnoreCase("LET")) {
                usuario.setDepartamento(comodin3);
                flag2 = false;
            } else {
                System.out.println("Dato incorrecto, ingrese nuevamente.");
            }
        }
        DirectorioTelefonico.agregar(usuario);

    }

    public static void opcion3() {

    }

    public static void opcion4() {
        System.out.println("Ingrese valor a buscar:");
        String busqueda = sc.nextLine();
        ArrayList<Usuario> Lista = DirectorioTelefonico.getDirectorio();
        ArrayList<Usuario> listaExportar = new ArrayList<>();

        for (int i = 0; i < Lista.size(); i++) {
            Usuario usuarioX = Lista.get(i);
            if (busqueda.equalsIgnoreCase(usuarioX.getNombre()) || busqueda.equalsIgnoreCase(usuarioX.getApellido())) {
                listaExportar.add(usuarioX);
            }

        }
        Collections.sort(listaExportar, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        for (Usuario user : listaExportar) {
            System.out.println(user.getNombre());
        }
        ;


    }
}
