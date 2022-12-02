/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author Cristopher
 */
public class Perro extends Animales {
    private String pelaje;

    public Perro(String pelaje, int id, String Nombre, int edad, String Raza, String Color, boolean Carnivoro) {
        super(id, Nombre, edad, Raza, Color, Carnivoro);
        this.pelaje = pelaje;
    }

    public Perro(String pelaje) {
        this.pelaje = pelaje;
    }
    
    public Perro() {
        this.pelaje = "";
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre Mascota: ").append(super.getNombre());
        sb.append("\nEdad: ").append(super.getEdad());
        return sb.toString();
    }
    
    
    
    
}
