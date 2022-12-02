/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.appescritorio.Dto;

/**
 *
 * @author Cristopher
 */
public class Dinosaurio {
    
    
    private String nombre;
    private String raza;
    private boolean tienecola;

    public Dinosaurio(String nombre, String raza, boolean tienecola) {
        this.nombre = nombre;
        this.raza = raza;
        this.tienecola = tienecola;
    }
 
    
        public Dinosaurio() {
        this.nombre = "";
        this.raza = "";
        this.tienecola = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isTienecola() {
        return tienecola;
    }

    public void setTienecola(boolean tienecola) {
        this.tienecola = tienecola;
    }
    
   @Override
        public String toString(){
         return  this.getNombre()+" "+this.getRaza()+" "+(this.isTienecola() ? "SI":"NO") +" tiene cola";
            
        }
}
