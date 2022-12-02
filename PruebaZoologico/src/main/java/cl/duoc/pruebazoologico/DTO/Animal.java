/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pruebazoologico.DTO;

/**
 *
 * @author Cristopher
 */
public abstract class Animal {
    private int ID;
    private String nombre;
    private String raza;
    private String patroncolor;
    private int edad; 
    private boolean vegetariano;

    public Animal(int ID, String nombre, String raza, String patroncolor, int edad, boolean vegetariano) {
        this.ID = ID;
        this.nombre = nombre;
        this.raza = raza;
        this.patroncolor = patroncolor;
        this.edad = edad;
        this.vegetariano = vegetariano;
    }
    
      public Animal() {
        this.ID = 0;
        this.nombre = "";
        this.raza = "";
        this.patroncolor = "";
        this.edad = 0;
        this.vegetariano = false;
    }  

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getPatroncolor() {
        return patroncolor;
    }

    public void setPatroncolor(String patroncolor) {
        this.patroncolor = patroncolor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    
    @Override    
      public abstract String toString();
 

    
}
