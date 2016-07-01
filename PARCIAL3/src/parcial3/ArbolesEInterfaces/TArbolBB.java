/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3.ArbolesEInterfaces;

import parcial3.ArbolesEInterfaces.IArbolBB;
import parcial3.ArbolesEInterfaces.IElementoAB;

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
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador) {
        contador[0] = 0;
        if (raiz != null) {
            return raiz.buscar(unaEtiqueta, contador);
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
