/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IElementoAB;

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
    public IElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public IElementoAB<T> getHijoDer() {
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
    public IElementoAB<T> buscar(Comparable unaEtiqueta, Integer[] contador) {
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
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
     
        //contador[0]++;
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            // System.out.println("ContadorIElementoEsIgual:" + contador[0]);
            return this;
        } else if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
            if (hijoIzq != null) {
                return hijoIzq.buscar(unaEtiqueta);
            }
        } else if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta);
        }
       // contador[0] = -1;
     
        return null;
    }

    @Override
    public boolean insertar(IElementoAB elemento, Integer[] contador) {
        System.out.println("INSERTAMOS ELEMENTO: " + elemento.getEtiqueta() + " Valor de Contador: " + contador[0]);
        contador[0]++;
        if (this.etiqueta.compareTo(elemento.getEtiqueta()) == 0) {
            System.out.println("El elemento ya está en el árbol");
            contador[0] = 0;
            return false;
        }
        if (this.etiqueta.compareTo(elemento.getEtiqueta()) > 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento, contador);
            }
        } else if (this.hijoDer == null) {
            this.hijoDer = elemento;
            return true;
        } else {
            return this.hijoDer.insertar(elemento, contador);
        }
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
    public int obtenerAltura() {
        int alturaIzquierdo = -1;
        int alturaDerecho = -1;
        if (this.hijoIzq != null) {
            alturaIzquierdo = hijoIzq.obtenerAltura();
        }
        if (this.hijoDer != null) {
            alturaDerecho = hijoDer.obtenerAltura();
        }
        return Math.max(alturaIzquierdo, alturaDerecho) + 1;

    }

    @Override
    public int obtenerTamanio() {
        int tamanioIzquierdo = 0;
        int tamanioDerecho = 0;
        if (hijoIzq != null) {
            tamanioIzquierdo += hijoIzq.obtenerTamanio();
        }
        if (hijoDer != null) {
            tamanioDerecho += hijoDer.obtenerTamanio();
        }
        return tamanioIzquierdo + tamanioDerecho + 1;
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
    public int obtenerCantidadHojas() {
        int hojasIzq = 0;
        int hojasDer = 0;

        if (hijoIzq != null) {
            hojasIzq = hijoIzq.obtenerCantidadHojas();
        }

        if (hijoDer != null) {
            hojasDer = hijoDer.obtenerCantidadHojas();
        }
        if (hijoIzq == null && hijoDer == null) {
            return 1;
        }

        return hojasIzq + hojasDer;

    }

    @Override
    public int listarHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IElementoAB encontrarMinimo() {
        if (hijoIzq != null) {
            return hijoIzq.encontrarMinimo();
        } else {
            return this;
        }
    }

    @Override
    public IElementoAB encontrarMaximo() {
        if (hijoDer != null) {
            return hijoDer.encontrarMaximo();
        } else {
            return this;
        }
    }

    @Override
    public void lexicograficamenteAnterior(Comparable unaClave,IElementoAB unElemento) {
        if (this.etiqueta.compareTo(unaClave) == 0) 
          return;
        if (this.etiqueta.compareTo(unaClave) < 0) {
            if (this.getHijoIzq() != null) {
                this.getHijoIzq().lexicograficamenteAnterior(unaClave, unElemento);
            }
        }
        unElemento= this;
        
        if (this.etiqueta.compareTo(unaClave) > 0){
            if (this.getHijoDer() != null){
                this.getHijoDer().lexicograficamenteAnterior(unaClave, unElemento);
            }
        }
        
    }

    @Override
    public T getDatos() {
        return this.datos;
    }
    
    @Override
    public IElementoAB eliminar(Comparable unaEtiqueta) {

        if (unaEtiqueta.compareTo(this.etiqueta) == -1) {
            if (this.hijoIzq != null) {
                this.hijoIzq = this.hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (unaEtiqueta.compareTo(this.etiqueta) == 1) {
            if (this.hijoDer != null) {
                this.hijoDer = this.hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }

        return this.quitarElNodo();

    }

    @Override
    public IElementoAB quitarElNodo() {
        if (hijoIzq == null) {
            return hijoDer;
        }
        if (hijoDer == null) {
            return hijoIzq;
        }
        IElementoAB elHijo = hijoIzq;
        IElementoAB elPadre = this;

        while (elHijo.getHijoDer() != null) {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }
        if (elPadre != this) {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(hijoIzq);
        }

        elHijo.setHijoDer(hijoDer);
        return elHijo;
    }

    
    @Override
    public int sumarClavesNivel(int n){
        if(n==0){
            return Integer.valueOf(this.etiqueta.toString());
        }
        else {
            int x = 0;
            int y = 0;
            if(this.hijoIzq != null){
                x = this.hijoIzq.sumarClavesNivel(n-1);
            }
            if(this.hijoDer != null){
                y = this.hijoDer.sumarClavesNivel(n-1);
            }
            
            return x+y;
        }
        
    }


    
}
