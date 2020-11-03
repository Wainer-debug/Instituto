/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.instituto.controler;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author Sebas
 */
@Named(value = "lista")
@SessionScoped
public class lista {

     private String option;  
    private List<String> options;
    
    private String cuota;  
    private List<String> coutas;
    
    private String pago;  
    private List<String> pagos;
    
    public lista() {
    }
    
    
    @PostConstruct
    public void init() {
         //options
        options = new ArrayList<String>();
        
            options.add("Inglés");
            options.add("Francés");
            options.add("Portugués");
            
        coutas = new ArrayList<String>();
        
            coutas.add("1");
            coutas.add("2");
            coutas.add("3");
            
             pagos = new ArrayList<String>();
        
             pagos.add("crédito");
            pagos.add("efectivo");
             pagos.add("cheque");
        
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public List<String> getCoutas() {
        return coutas;
    }

    public void setCoutas(List<String> coutas) {
        this.coutas = coutas;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public List<String> getPagos() {
        return pagos;
    }

    public void setPagos(List<String> pagos) {
        this.pagos = pagos;
    }
 
    
    
    
    }
    
