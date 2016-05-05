/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.INodo;
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
    private Lista<Comparable> actores;
    private Lista<Comparable> productores;
    private Lista<Comparable> directores;

    public Pelicula(Comparable id, String nombre, short fecha, float ranking, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ranking = ranking;
        
        actores = new Lista();
        productores = new Lista();
        directores = new Lista();
    }

    public String toText() {
        String texto = "\n\nYear: " + this.fecha
                + "\nRanking: " + this.ranking + " Estrellas"
                + "\n\nDescription: " + this.descripcion; //+
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
        this.ranking = ranking;
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
    public float getRanking() {
        return this.ranking;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarActor(Comparable idActor) {
        Nodo<Comparable> nuevoNodo = new Nodo<>(idActor, idActor);
        this.actores.insertar(nuevoNodo);

    }

    public void agregarProductor(Comparable idProductor) {
        Nodo<Comparable> nuevoNodo = new Nodo<>(idProductor, idProductor);
        this.productores.insertar(nuevoNodo);
    }

    public void agregarDirector(Comparable idDirector) {
        Nodo<Comparable> nuevoNodo = new Nodo<>(idDirector, idDirector);
        this.directores.insertar(nuevoNodo);
    }

    public Lista<Comparable> getListaActores() {
        return this.actores;
    }

    public Lista<Comparable> getListaProductores() {
        return this.productores;
    }

    public Lista<Comparable> getListaDirectores() {
        return this.directores;
    }

    public boolean existeActor(Comparable idActor) {
        INodo<Comparable> aux = actores.getPrimero();
        while (aux != null) {
            if (aux.getEtiqueta() == idActor){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;

    }
    
    public boolean existeProductor(Comparable idProductor) {
        INodo<Comparable> aux = productores.getPrimero();
        while (aux != null) {
            if (aux.getEtiqueta() == idProductor){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;

    }
    
    public boolean existeDirector(Comparable idDirectores) {
        INodo<Comparable> aux = directores.getPrimero();
        while (aux != null) {
            if (aux.getEtiqueta() == idDirectores){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;

    }

}
