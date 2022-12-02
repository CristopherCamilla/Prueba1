/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.VALIDACIONES;

/**
 *
 * @author Cristopher
 */
public class validaciones {
    
    public static boolean validarNombre(String nombre){

        return (!nombre.isEmpty()&& nombre.length()>2);

    }
    
    public static boolean validarEdad(int edad){
        
        return (edad>0 && edad<100);
    }
    
}
