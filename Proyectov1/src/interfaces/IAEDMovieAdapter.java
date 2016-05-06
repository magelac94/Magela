/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import proyectov1.*;
import proyectov1.Actor;
import proyectov1.ActorPelicula;
import proyectov1.Lista;
import proyectov1.Pelicula;

/**
 *
 * @author Josse
 */
public interface IAEDMovieAdapter {
    void cargarDatos();
    
   
    
    Lista<Pelicula> obtenerPeliculas();
    Lista<Persona> obtenerActores();
    void obtenerPeliculasActores();
    Lista<Pelicula> getPeliculas();
    Pelicula getPelicula(String nombre);
    IManejadorPeliculas getManejador();
    Lista<Actor> getActores();
    Lista<Pelicula>buscarPorFechaLista(short fecha, Lista<Pelicula> lista);
    Lista<Pelicula>buscarPorRankingLista(float ranking, Lista<Pelicula> lista);
    Lista<ActorPelicula> getActorPelicula();
    Pelicula buscarPorNombre(String nombre);
    Lista<Pelicula> buscarPorNombreLista(String nombre);
    Lista<Pelicula> buscarPorFechaLista(short fecha);
    String actoresToText(Pelicula p);
    String productoresToText(Pelicula p);
    String directoresToText(Pelicula p);
    Lista<Pelicula> buscarPorGeneroLista(String unGenero, Lista<Pelicula> lista);
    Lista<Pelicula> buscarPorActorLista(String nombreActor, Lista<Pelicula> lista);
    Lista<Pelicula> buscarPorProductorLista(String nombreProductor, Lista<Pelicula> lista);
    Lista<Pelicula> buscarPorDirectorLista(String nombreDirector, Lista<Pelicula> lista);


        
}
