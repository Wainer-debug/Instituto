package edu.instituto.modelo;


public class Curso {

    private String nombreCurso = "";
    private String formaPago= "";
    private int numCuotas = 0;

    public Curso() {
    }
    
    public Curso(String nombreCurso, String formaPago, int numCuotas) {
        this.nombreCurso = nombreCurso;
        this.formaPago = formaPago;
        this.numCuotas = numCuotas;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String planPago) {
        this.formaPago = planPago;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }
    

}
