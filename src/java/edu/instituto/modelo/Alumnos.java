
package edu.instituto.modelo;


public class Alumnos {
    
    private String nombreAlum = "";
    private String apellidoAlum = "";
    private String correo = "";
    private String cedula  = "";
    private String direccion = "";
    private String telefono = "";
    private String ocupacion = "";

    public Alumnos() {
    }

    public Alumnos(String nombreAlum, String apellidoAlum, String cedula, String correo, 
    String telefono, String direccion, String ocupacion) {
        this.nombreAlum = nombreAlum;
        this.apellidoAlum = apellidoAlum;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public String getApellidoAlum() {
        return apellidoAlum;
    }

    public void setApellidoAlum(String apellidoAlum) {
        this.apellidoAlum = apellidoAlum;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    
    
    
}
