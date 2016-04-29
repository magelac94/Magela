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
    
    Pelicula [] obtenerPeliculas();
    
    Actor [] obtenerActores();
    
    ActorPelicula [] obtenerPeliculasActores();
    
    Pelicula[] getPeliculas();
    
    Pelicula getPelicula(String nombre);
        
}
