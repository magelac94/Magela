/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import proyectov1.Lista;
import proyectov1.Persona;


/**
 *
 * @author Magela
 */
public interface IManejadorPersonas{
    
    public Lista<Persona> getLista();
    public void insertarPersona(Persona unaPersona);
    public Persona buscarPorCodigo(Comparable codigo);
 
    
    public Persona buscarPorNombre(String nombre);
    public Lista<Persona> buscarPorNombreLista(String nombreBuscar);
    public Lista<Persona> buscarPorNombreLista(String nombreBuscar, Lista<Persona> listaDondeBuscar);
   
    public int cantidadPersonas();
    
}
