/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.SERVICE;

import cl.duoc.veterinaria.DTO.Perro;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class listaPerro {

    
    private ArrayList<Perro> listaPerro;

    public listaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }
    
        public listaPerro() {
        listaPerro = new ArrayList();
    }

    public ArrayList<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }
    
        public void AgregarPerro(Perro perrito){
        this.listaPerro.add(perrito);
    }
    
    public void EliminarInstagram(Perro perrito){
        this.listaPerro.remove(perrito);
    }
    
    public void ReemplazarInstagram(int indice, Perro perrito){
        this.listaPerro.set(indice, perrito);
    }
    
    public Perro ObtenerInstagram(int indice){
        return this.listaPerro.get(indice);
    }
}
