/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.DTO;

/**
 *
 * @author Cristopher
 */
public class Perro {
    private int chip;
    private String nombre;
    private String color;
    private boolean castrado;

    public Perro() {
        this.chip = 0;
        this.nombre = "";
        this.color = "";
        this.castrado = false;
    }

    public Perro(int chip, String nombre, String color, boolean castrado) {
        this.chip = chip;
        this.nombre = nombre;
        this.color = color;
        this.castrado = castrado;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    
    
        @Override
    public String toString(){
        // Ternario
        //String valor = this.isCastrado() ? "SI" : "NO";
        return 
                "Nombre:" + this.getNombre() + "\n" +
                "Color:" + this.getColor() + "\n" +
                "Chip:" + this.getChip() + "\n" +
                "¿Castrado?: " +
                ( this.isCastrado() ? "Si" : "No" );
    }
     
}
