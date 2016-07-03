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
public class TArbolBB implements IArbolBB {

    protected IElementoAB raiz;

    @Override
    public boolean insertar(IElementoAB unElemento) {
        if (this.raiz == null) {
            this.raiz = unElemento;
            return true;
        } else {
            return this.raiz.insertar(unElemento);
        }
    }

    @Override
    public boolean insertar(IElementoAB unElemento, Integer[] contador) {
        if (this.raiz == null) {
            this.raiz = unElemento;
            contador[0] = 1;
            return true;
        } else {
            return this.raiz.insertar(unElemento, contador);
        }
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador) {
        contador[0] = 0;
        if (raiz != null) {
            return raiz.buscar(unaEtiqueta, contador);
        } else {
            return null;

        }
    }
    
    @Override
    public IElementoAB buscar(Comparable unaEtiqueta) {
    //    contador[0] = 0;
        if (raiz != null) {
            return raiz.buscar(unaEtiqueta);
        } else {
            return null;

        }
    }

    @Override
    public String preOrden() {
        if (this.raiz != null) {
            return raiz.preOrden();
        }
        return "Arbol Vacio";
    }

    @Override
    public String inOrden() {
        if (this.raiz != null) {
            return raiz.inOrden();
        }
        return "Arbol Vacio";

    }

    @Override
    public String postOrden() {
        if (raiz != null) {
            return raiz.postOrden();
        }
        return "Arbol Vacio";
    }

    @Override
    public int obtenerAltura() {
        if (raiz != null) {
            return raiz.obtenerAltura();
        } else {
            return -1;
        }
    }

    @Override
    public int obtenerTamanio() {
        if (raiz == null) {
            return 0;
        } else {
            return raiz.obtenerTamanio();

        }
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        if (raiz != null) {
            Integer[] nivel = new Integer[1];
            nivel[0] = 0;
            raiz.obtenerNivel(unaEtiqueta, nivel);
            return nivel[0];
        } else {
            return -1;
        }

    }

    
    @Override
    public int obtenerCantidadHojas() {
        if (raiz != null) {
            return raiz.obtenerCantidadHojas();
        } else {
            return -1;
        }
    }

    @Override
    public void listarHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IElementoAB encontrarMinimo() {
        if (raiz != null) {
            return raiz.encontrarMinimo();
        } else {
            return null;
        }
    }

    @Override
    public IElementoAB encontrarMaximo() {
        if (raiz != null) {
            return raiz.encontrarMaximo();
        } else {
            return null;
        }
    }

    @Override
    public IElementoAB lexicograficamenteAnterior(Comparable unaClave) {
        IElementoAB anterior = null;
        if(raiz != null){
           raiz.lexicograficamenteAnterior(unaClave, anterior);
        }
        return anterior;
    }

    @Override
    public int obtenerCantNodosNivel(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esDeBusqueda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the raiz
     */
    public IElementoAB getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(IElementoAB raiz) {
        this.raiz = raiz;
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (this.raiz!=null)
        {
            this.raiz=this.raiz.eliminar(unaEtiqueta);
        }
    }
    
    public int sumarClavesNivel(int n){
        if(this.raiz != null){
            return this.raiz.sumarClavesNivel(n);
        }
        else {
            return 0;
        }
    }

    @Override
    public int calcularCostoExito(int[] frecExito, int nivel, int[] contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularCostoNoExito(int[] frecNoExito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularCosto(int[] frecExito, int[] frecNoExito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
