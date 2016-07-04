/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.*;

/**
 *
 * @author Magela
 */
public class ManejadorPersonasAB implements IManejadorPersonasAB {

    private TArbolBB<Persona> arbolPersonas;

    ManejadorPersonasAB() {
        arbolPersonas = new TArbolBB();
    }

    @Override
    public TArbolBB getArbol() {
        return arbolPersonas;
    }

    @Override
    public void insertarPersona(Persona unaPersona) {
        TElementoArbolBB nuevoNodo = new TElementoArbolBB<>(unaPersona, unaPersona.getId());
        arbolPersonas.insertar(nuevoNodo);
    }

    @Override
    public Persona buscarPorCodigo(Comparable codigo) {

        IElementoAB<Persona> personaEncontrada = arbolPersonas.buscar(codigo);
        if (personaEncontrada == null) { //verifica que no sea null
            return null;
        }
        return personaEncontrada.getDatos();

    }

    @Override
    public int cantidadPersonas() {
        return this.arbolPersonas.obtenerTamanio();

    }
    
    @Override
    public void eliminar(Persona unaPersona){
        arbolPersonas.eliminar(unaPersona.getId());
    }

    /*
    @Override
    

    @Override
    public Persona buscarPorNombre(String nombre) {
        
        INodo<Persona> aux = arbolPersonas.getPrimero();

        while (aux != null) {
            if (aux.getDato().getNombre().equals(nombre)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public Lista<Persona> buscarPorNombreLista(String nombreBuscar) {
        if (nombreBuscar != null) {
            IManejadorPersonas buscoPersona = new ManejadorPersonas();

            INodo<Persona> aux = listaPersonas.getPrimero();

            while (aux != null) {
                int estoyNoestoy = aux.getDato().getNombre().toUpperCase().indexOf(nombreBuscar.toUpperCase());
                System.out.println(estoyNoestoy);
                if (estoyNoestoy != -1) {
                    buscoPersona.insertarPersona(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscoPersona.getLista();
        } else {
            return listaPersonas;
        }

    }

    @Override
    public Lista<Persona> buscarPorNombreLista(String nombreBuscar, Lista<Persona> listaDondeBuscar) {
        if (nombreBuscar != null) {
            IManejadorPersonas buscoPersona = new ManejadorPersonas(); // creo una listita para las peliculas encontradas

            INodo<Persona> aux = listaDondeBuscar.getPrimero();

            while (aux != null) {
                int estoyNoestoy = aux.getDato().getNombre().toUpperCase().indexOf(nombreBuscar.toUpperCase());

                if (estoyNoestoy != -1) {
                    buscoPersona.insertarPersona(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            return buscoPersona.getLista();
        } else {
            return listaDondeBuscar;
        }
    }


    @Override
    public int cantidadPersonas() {
        return this.arbolPersonas.cantElementos();
    }
    
    */
        

}
