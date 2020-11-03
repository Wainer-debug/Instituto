
package edu.instituto.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

public class Curso {
    
    private String nombreCurso = "";
    private String contenido = "";
    private String duracion = "";
    private String  nivel = "";
    private String fechaInicio;
    private String fechaFin;    
    private int costoMatricula = 0;
    
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            
    public Curso() {
      
        
    }
    
    public void guardarCurso(){
       
        
    }
    
    public void contenidoCurso(){
         
        if("Inglés".equals(this.nombreCurso)){
            this.contenido = "Pronouns:Personal Pronouns,Possessives,Demonstrative Pronouns,Reflexive Pronouns ";
            this.fechaInicio =  "2020-02-01";
            this.fechaFin =  "2020-04-01";
            this.duracion = "150 ";
        } 
        else if("Francés".equals(this.nombreCurso)){
            this.contenido = "Con el curso de francés para principiantes adquieres un vocabulario básico de más de 1.300 palabras y alcanzas los niveles A1/A2 del Marco Común Europeo de Referencia para las Lenguas.\n" +
"Si eliges el paquete completo de francés, aprenderás más de 5.000 palabras y alcanzarás los niveles C1/C2.";
            this.fechaInicio =  "2020-02-15";
            this.fechaFin =  "2020-05-01";
             this.duracion = "180";
            }
        else if("Portugués".equals(this.nombreCurso)){
            this.contenido = "Cómo saludar, verbos irregulares y vocabulario - Vamos a jugar un poco - Verbos irregulares y vocabulario - Ejercicio de traducción - Vocabulario y ejercicios - Más vocabulario - Vocabulario, el cuento de \"Pinocho\" y ejercicios - Ahora un poco más de vocabulario - Vocabulario, contracciones, verbo";
            this.fechaInicio =  "2020-02-01";
            this.fechaFin =  "2020-05-15";
             this.duracion = "200";
        } 
        
    }
    
   

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(int costoMatricula) {
        this.costoMatricula = costoMatricula;
    }


       
    
    
}
