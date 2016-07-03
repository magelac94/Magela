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

    private TArbolBB arbolPersonas;

    ManejadorPersonasAB() {
        arbolPersonas = new TArbolBB();
    }

    @Override
    public TArbolBB getArbol() {
        return arbolPersonas;
    }

    @Override
    public void insertarPersona(Persona unaPersona) {
        TElementoArbolBB nuevoNodo = new TElementoArbolBB<Persona>(unaPersona, unaPersona.getId());
        this.arbolPersonas.insertar(nuevoNodo);
    }

    @Override
    public Persona buscarPorCodigo(Comparable codigo) {
        IElementoAB personaEncontrada = arbolPersonas.buscar(codigo);
        if (personaEncontrada == null) { //verifica que no sea null
            return null;
        }
        Persona producto = (Persona) personaEncontrada.getDatos(); // arreglar
        return producto;

    }
/*
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
*/

    @Override
    public int cantidadPersonas() {
        return this.arbolPersonas.cantElementos();
    }
    
    
        

}
