/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author Magela
 */
public class Pelicula implements IPelicula {

    public Comparable id;
    public String fecha;
    public String nombre;
    public String descripcion;
    public Integer ranking;

    public Pelicula(String id, String fecha, String nombre, String descripcion, Integer ranking) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }

    // para peliculas nuevas el id se autogenera
    public Pelicula(String fecha, String nombre, String descripcion, Integer ranking) {
        this.id = "0"; // autogenerar
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }
    
    
    @Override
    public Comparable getId() {
        return this.id;
    }

    @Override
    public String getFecha() {
        return this.fecha;
    }

    @Override
    public void setRanking(Integer ranking) {
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
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    

}
