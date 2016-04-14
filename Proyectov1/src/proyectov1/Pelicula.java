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
public class Pelicula {

    public String id;
    public String fecha;
    public String nombre;
    public String descripcion;
    public String ranking;

    public Pelicula(String id, String fecha, String nombre, String descripcion, String ranking) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }

    // para peliculas nuevas el id se autogenera
    public Pelicula(String fecha, String nombre, String descripcion, String ranking) {
        this.id = "0"; // autogenerar
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
    }

}
