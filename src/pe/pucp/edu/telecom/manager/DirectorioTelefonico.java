package pe.pucp.edu.telecom.manager;

import pe.pucp.edu.telecom.entity.Usuario;

import java.util.ArrayList;

public class DirectorioTelefonico {
    private static ArrayList<Usuario> directorio=new ArrayList<>();

    public static ArrayList<Usuario> getDirectorio() {
        return directorio;
    }

    public static void setDirectorio(ArrayList<Usuario> directorio) {
        DirectorioTelefonico.directorio = directorio;
    }

    public static void agregar(Usuario usuario) {
        directorio.add(usuario);
    }


}
