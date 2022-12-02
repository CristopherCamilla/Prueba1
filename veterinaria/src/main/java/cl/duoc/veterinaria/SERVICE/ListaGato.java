/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.SERVICE;

import cl.duoc.veterinaria.DTO.Gato;
import cl.duoc.veterinaria.DTO.Perro;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class ListaGato {
    
        private ArrayList<Gato> listaGato;

    public ListaGato(ArrayList<Gato> listaGato) {
        this.listaGato = listaGato;
    }

    public ArrayList<Gato> getListaGato() {
        return listaGato;
    }

    public void setListaGato(ArrayList<Gato> listaGato) {
        this.listaGato = listaGato;
    }



    public void AgregarPerro(Gato gatito){
        this.listaGato.add(gatito);
    }
    
    public void EliminarInstagram(Gato gatito){
        this.listaGato.remove(gatito);
    }
    
    public void ReemplazarInstagram(int indice, Gato gatito){
        this.listaGato.set(indice, gatito);
    }
    
    public Gato ObtenerInstagram(int indice){
        return this.listaGato.get(indice);
    }
    
    
    
    
    
}
