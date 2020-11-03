package edu.instituto.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import edu.instituto.modelo.Alumnos;
import edu.instituto.modelo.Curso;

@Named(value = "informacionSession")
@SessionScoped
public class informacionSession implements Serializable {

    private Alumnos objAlum = new Alumnos();
    private ArrayList<Alumnos> listaAlum= new ArrayList<>();
    
    private Curso objCurso = new Curso();
    private ArrayList<Curso> listaCurso= new ArrayList<>();
    
    public informacionSession() {
    }
    
    public void registrarInfo(){
   
    listaAlum.add(new Alumnos(objAlum.getNombreAlum(),objAlum.getApellidoAlum(),
    objAlum.getCedula(),objAlum.getCorreo(),objAlum.getTelefono(),objAlum.getDireccion(),
    objAlum.getOcupacion()));
    listaCurso.add(new Curso(objCurso.getNombreCurso(),objCurso.getFormaPago(),
    objCurso.getNumCuotas())); 
    }

    public Alumnos getObjAlum() {
        return objAlum;
    }

    public void setObjAlum(Alumnos objAlum) {
        this.objAlum = objAlum;
    }

    public ArrayList<Alumnos> getListaAlum() {
        return listaAlum;
    }

    public void setListaAlum(ArrayList<Alumnos> listaAlum) {
        this.listaAlum = listaAlum;
    }

    public Curso getObjCurso() {
        return objCurso;
    }

    public void setObjCurso(Curso objCurso) {
        this.objCurso = objCurso;
    }

    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }
    
    
    
}
