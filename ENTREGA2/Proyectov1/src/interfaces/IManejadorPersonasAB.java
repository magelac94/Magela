/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import proyectov1.*;


/**
 *
 * @author Magela
 */
public interface IManejadorPersonasAB{
    
    public TArbolBB getArbol();
    public void insertarPersona(Persona unaPersona);
    public Persona buscarPorCodigo(Comparable codigo);
    public int cantidadPersonas();
    public void eliminar(Persona unaPersona);
    
}
