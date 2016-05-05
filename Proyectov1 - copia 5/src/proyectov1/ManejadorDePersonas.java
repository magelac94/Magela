/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IManejadorDePersonas;
import interfaces.INodo;
import interfaces.IPersona;

/**
 *
 * @author Magela
 */
public class ManejadorDePersonas implements IManejadorDePersonas {

    private Lista<Persona> listaPersonas;

    ManejadorDePersonas() {
        listaPersonas = new Lista();
    }

    @Override
    public Lista<Persona> getLista() {
        return listaPersonas;
    }

    @Override
    public void insertarPersona(Persona unaPersona) {
        Nodo<Persona> nuevoNodo = new Nodo<>(unaPersona, unaPersona.getId());
        this.listaPersonas.insertar(nuevoNodo);
    }

    @Override
    public IPersona buscarPorCodigo(Comparable codigo) {
        INodo<Persona> nodoConPersona = this.listaPersonas.buscar(codigo);
        if (nodoConPersona == null) { //verifica que no sea null
            return null;
        }
        IPersona producto = nodoConPersona.getDato();
        return producto;

    }

    @Override
    public Persona buscarPorNombre(String nombre) {
        
        INodo<Persona> aux = listaPersonas.getPrimero();

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
            IManejadorDePersonas buscoPersona = new ManejadorDePersonas(); // creo una listita para las peliculas encontradas

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
            IManejadorDePersonas buscoPersona = new ManejadorDePersonas(); // creo una listita para las peliculas encontradas

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
        return this.listaPersonas.cantElementos();
    }
    
    
        

}
