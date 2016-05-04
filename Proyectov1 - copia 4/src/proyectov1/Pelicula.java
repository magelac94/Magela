/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IPelicula;

/**
 *
 * @author Magela
 */
public class Pelicula implements IPelicula {

    private Comparable id;
    private String nombre;
    private short fecha;
    private float ranking;
    private String descripcion;
    

    public Pelicula(Comparable id, String nombre, short fecha, float ranking, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }

    public String toText(){
        String texto =  "\n\nYear: " + this.fecha + 
                        "\nRanking: "+ this.ranking + " Estrellas" + 
                        "\n\nDescription: "+this.descripcion; //+
                  //      "\nActores:" + obtenerActores() +
                  //      "\nDirectores: "+ obtenerDirectores();
        return texto;
    
    }
    
    @Override
    public Comparable getId() {
        return this.id;
    }

    @Override
    public short getFecha() {
        return this.fecha;
    }

    @Override
    public void setRanking(float ranking) {
        this.ranking=ranking;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
        
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public float getRanking(){
        return this.ranking;
    }
            

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    

}
