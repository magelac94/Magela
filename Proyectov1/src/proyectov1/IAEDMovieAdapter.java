/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import proyectov1.*;

/**
 *
 * @author Josse
 */
public interface IAEDMovieAdapter {
    void cargarDatos();
    
    Lista<Pelicula> obtenerPeliculas();
    
    Lista<Actor> obtenerActores();
    
    Lista<ActorPelicula> obtenerPeliculasActores();
    
    Lista<Pelicula> getPeliculas();
    
    Pelicula getPelicula(String nombre);
    
    
    IManejadorDePeliculas getManejador();

    
    Lista<Actor> getActores();
    Lista<Pelicula>buscarPorFechaLista(String nombre, Lista<Pelicula> lista);
  
    Lista<ActorPelicula> getActorPelicula();
    
    Pelicula buscarPorNombre(String nombre);
    
    Lista<Pelicula> buscarPorNombreLista(String nombre);

        
}
