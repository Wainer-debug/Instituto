/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.instituto.controler;

import edu.instituto.model.Alumnos;
import edu.instituto.model.Curso;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;



@Named(value = "indexController")

@SessionScoped
public class indexController implements Serializable {
    
 private Alumnos Alum = new Alumnos();
    private ArrayList<Alumnos> listaAlum= new ArrayList<>();
    
    private Curso Curs = new Curso();
    private ArrayList<Curso> listaCurso= new ArrayList<>();
  

    public indexController() {
        
    }
 
 
    public void guardarInformacion(){
   
    listaAlum.add(Alum);
    listaCurso.add(Curs);
    Curs.contenidoCurso();
     
    }
    
    public void cargarContenido(){
       
     Curs.contenidoCurso();
    }
    
    

    public Alumnos getAlum() {
        return Alum;
    }

    public void setAlum(Alumnos Alum) {
        this.Alum = Alum;
    }

    public ArrayList<Alumnos> getListaAlum() {
        return listaAlum;
    }

    public void setListaAlum(ArrayList<Alumnos> listaAlum) {
        this.listaAlum = listaAlum;
    }

    public Curso getCurs() {
        return Curs;
    }

    public void setCurs(Curso Curs) {
        this.Curs = Curs;
    }

    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    
}
