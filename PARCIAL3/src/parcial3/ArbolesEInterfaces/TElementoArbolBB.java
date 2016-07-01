/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3.ArbolesEInterfaces;

import parcial3.ArbolesEInterfaces.IElementoAB;

/**
 *
 * @author Magela
 */
public class TElementoArbolBB<T> implements IElementoAB {

    Comparable etiqueta;
    private IElementoAB hijoIzq;
    private IElementoAB hijoDer;
    private T datos;

    public TElementoArbolBB(T datos, Comparable etiqueta) {
        this.etiqueta = etiqueta;
        this.datos = datos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public IElementoAB getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public IElementoAB getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(IElementoAB elemento) {
        hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(IElementoAB elemento) {
        hijoDer = elemento;
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador) {
        System.out.println("BUSCAMOS ELEMENTO: " + unaEtiqueta + " Valor de Contador: " + contador[0]);
        contador[0]++;
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            // System.out.println("ContadorIElementoEsIgual:" + contador[0]);
            return this;
        } else if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
            if (hijoIzq != null) {
                return hijoIzq.buscar(unaEtiqueta, contador);
            }
        } else if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta, contador);
        }
        contador[0] = -1;
        System.out.println("NO EXISTE EL ELEMENTO: " + unaEtiqueta + " Valor de Contador:" + contador[0]);
        return null;
    }


    @Override
    public boolean insertar(IElementoAB elemento) {

        if (this.etiqueta.compareTo(elemento.getEtiqueta()) == 0) {
            System.out.println("El elemento ya está en el árbol");
            return false;
        }
        if (this.etiqueta.compareTo(elemento.getEtiqueta()) > 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento);
            }
        } else if (this.hijoDer == null) {
            this.hijoDer = elemento;
            return true;
        } else {
            return this.hijoDer.insertar(elemento);
        }
    }

    @Override
    public String preOrden() {
        String resultado = this.etiqueta.toString();
        if (this.hijoIzq != null) {
            resultado = resultado + "-" + this.hijoIzq.preOrden();

        }
        if (this.hijoDer != null) {
            resultado = resultado + "-" + this.hijoDer.preOrden();
        }
        return resultado;
    }

    @Override
    public String inOrden() {
        String resultado = this.etiqueta.toString();

        if (this.hijoIzq != null) {
            resultado = this.hijoIzq.inOrden() + "-" + resultado;
        }
        if (this.hijoDer != null) {
            resultado = resultado + "-" + this.hijoDer.inOrden();
        }
        return resultado;
    }

    @Override
    public String postOrden() {
        String resultado = "";

        if (this.hijoIzq != null) {
            resultado = this.hijoIzq.postOrden();
        }
        if (this.hijoDer != null) {
            resultado += this.hijoDer.postOrden();
        }

        return resultado + "-" + this.etiqueta.toString();
    }

    @Override
    public void obtenerNivel(Comparable unaEtiqueta, Integer[] nivel) {

        if (this.etiqueta.compareTo(unaEtiqueta) == 1) {
            if (this.hijoIzq == null) {
                nivel[0] = -1;
            } else {
                nivel[0]++;
                this.hijoIzq.obtenerNivel(unaEtiqueta, nivel);
            }
        }
        if (this.etiqueta.compareTo(unaEtiqueta) == -1) {
            if (this.hijoDer == null) {
                nivel[0] = -1;
            } else {
                nivel[0]++;
                this.hijoDer.obtenerNivel(unaEtiqueta, nivel);
            }
        }

    }

    @Override
    public Object getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularCostoExito(int[] frecExito, int nivel, int[] contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularCostoNoExito(int[] frecNoExito, int nivel, int[] contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularCosto(int[] frecExito, int[] frecNoExito, int nivel, int[] contadorExito, int[] contadorNoExito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
