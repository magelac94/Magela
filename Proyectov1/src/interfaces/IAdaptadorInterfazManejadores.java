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
 * Interface del Adaptador que se utiliza para vincular la Interfaz grafica con
 * el resto del programa.
 *
 * @author Magela
 */
public interface IAdaptadorInterfazManejadores {

    /**
     * Cargar Datos desde la Base de Datos
     */
    void cargarDatos();

    /**
     * Obtener la lista de peliculas de la base de datos
     *
     * @return lista de peliculas
     */
    Lista<Pelicula> obtenerPeliculas();

    /**
     * Obtener la lista de actores de la base de datos
     *
     * @return lista de actores
     */
    Lista<Persona> obtenerActores();

    /**
     * Obtener la lista de peliculas de la clase
     *
     * @return lista de peliculas
     */
    Lista<Pelicula> getPeliculas();

    /**
     * Obtener una pelicula dada
     *
     * @param nombre nombre de la pelicula que quiero obtener
     * @return objeto pelicula
     */
    Pelicula getPelicula(String nombre);

    /**
     * Obtener el Manejador de Peliculas
     *
     * @return IManejador de Peliculas
     */
    IManejadorPeliculas getManejador();

    /**
     * Obtener lista de Actores
     *
     * @return lista de actores
     */
    Lista<Actor> getActores();

    /**
     * Buscar Por fecha en una Lista dada por parametros
     *
     * @param fecha la fecha que quiero buscar
     * @param lista la lista de peliculas donde quiero buscar esa fecha
     * @return una lista de peliculas que tienen la fecha dada
     */
    Lista<Pelicula> buscarPorFechaLista(short fecha, Lista<Pelicula> lista);

    /**
     * Buscar por ranking en una lista dada por parametros
     *
     * @param ranking el numero de ranking que quiero buscar
     * @param lista la lista de peliculas donde quiero buscar el ranking.
     * @return una lista de peliculas que tienen ese ranking.
     */
    Lista<Pelicula> buscarPorRankingLista(float ranking, Lista<Pelicula> lista);

    /**
     * NO lo utilizo
     *
     * @return
     */
    Lista<ActorPelicula> getActorPelicula();

    /**
     * Buscar una Pelicula por su nombre
     *
     * @param nombre nombre de la pelicula que se quiere buscar
     * @return la pelicula la pelicula encontrada
     */
    Pelicula buscarPorNombre(String nombre);

    /**
     * Busqueda por Nombre devolviendo una lista
     *
     * @param nombre nombre de la pelicula que se quiere buscar
     * @return una lista de peliculas que contienen el nombre pasado
     */
    Lista<Pelicula> buscarPorNombreLista(String nombre);

    /**
     * Busca las peliculas con una fecha determinada
     *
     * @param fecha fecha que quiero buscar
     * @return lista de peliculas en esa fecha en el total de peliculas
     */
    Lista<Pelicula> buscarPorFechaLista(short fecha);

    /**
     * Actores a Texto Convierte los datos de los actores de una pelicula a un
     * string para luego poder imprimirlos
     *
     * @param p pelicula
     * @return string con los actores
     */
    String actoresToText(Pelicula p);

    /**
     * Productores a Texto Convierte los datos de los actores de una pelicula a un
     * string para luego poder imprimirlos
     *
     * @param p pelicula
     * @return string con los productores
     */
    String productoresToText(Pelicula p);

    /**
     * Directores a Texto Convierte los datos de los actores de una pelicula a un
     * string para luego poder imprimirlos
     *
     * @param p pelicula
     * @return string con los directores
     */
    String directoresToText(Pelicula p);

    /**
     * Buscar por Genero en una lista de peliculas dada
     * @param unGenero el genero que quiero buscar
     * @param lista lista en donde quiero buscar
     * @return una lista de peliculas donde se encuentra ese genero
     */
    Lista<Pelicula> buscarPorGeneroLista(String unGenero, Lista<Pelicula> lista);

    /**
     * Busca peliculas con un determinado actor en una determinada lista de peliculas
     * @param nombreActor nombre de actor que quiero buscar
     * @param lista lista donde quiero buscar
     * @return lista de peliculas donde se encuentra el actor.
     */
    Lista<Pelicula> buscarPorActorLista(String nombreActor, Lista<Pelicula> lista);

    /**
     * Busca peliculas con un determinado productor en una determinada lista de peliculas
     * @param nombreProductor nombre de productor que quiero buscar
     * @param lista lista donde quiero buscar
     * @return lista de peliculas donde se encuentra el productor.
     */
    Lista<Pelicula> buscarPorProductorLista(String nombreProductor, Lista<Pelicula> lista);

    /**
     * Busca peliculas con un determinado director en una determinada lista de peliculas
     * @param nombreDirector nombre de actor que quiero buscar
     * @param lista lista donde quiero buscar
     * @return lista de peliculas donde se encuentra el director.
     */
    Lista<Pelicula> buscarPorDirectorLista(String nombreDirector, Lista<Pelicula> lista);

}
