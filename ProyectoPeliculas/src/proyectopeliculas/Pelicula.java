/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopeliculas;

/**
 *
 * @author Rodrigo
 */
public class Pelicula {

    final int idPeliculas;
    String nomPeliculas;
    String anioPeliculas;
    String ranking;
    String descripcion;

    public Pelicula(int idPeliculas, String nomPeliculas, String anioPeliculas, String ranking, String descripcion) {

        this.idPeliculas = idPeliculas;
        this.nomPeliculas = nomPeliculas;
        this.anioPeliculas = anioPeliculas;
        this.ranking = ranking;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return this.nomPeliculas;
    }

    public String toText() {
        String texto = "Nombre: " + this.nomPeliculas + "\nID Pelicula: " + String.valueOf(this.idPeliculas) + "\nActores:";
        return texto;

    }

}
