package pe.pucp.edu.telecom.entity;

public class Usuario {
    private int codigopucp;
    private String nombre;
    private String apellido;
    private int telefono;
    private int anexo;
    private String departamento;

    public int getCodigopucp() {
        return codigopucp;
    }

    public void setCodigopucp(int codigopucp) {
        this.codigopucp = codigopucp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnexo() {
        return anexo;
    }

    public void setAnexo(int anexo) {
        this.anexo = anexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
