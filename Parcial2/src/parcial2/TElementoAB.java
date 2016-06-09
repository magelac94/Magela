package parcial2;

/**
 * @author Programacion2
 *
 */
public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private IElementoAB hijoIzq;
    private IElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public IElementoAB getHijoIzq() {
        return hijoIzq;
    }

    public IElementoAB getHijoDer() {
        return hijoDer;
    }

    /**
     * @param unElemento
     * @return
     */
    @SuppressWarnings("unchecked")
    public boolean insertar(IElementoAB unElemento) {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().insertar(unElemento);
            } else {
                hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                return getHijoDer().insertar(unElemento);
            } else {
                hijoDer = unElemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    public IElementoAB buscar(Comparable unaEtiqueta) {

        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    /**
     * @return recorrida en inorden del subArbol que cuelga del elemento actual
     */
    public String inOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null) {
            tempStr.append(getHijoIzq().inOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        if (hijoDer != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().inOrden());
        }

        return tempStr.toString();
    }

    /**
     * @return recorrida en preOrden del subArbol que cuelga del elemento actual
     */
    public String preOrden() {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(imprimir());
        if (hijoIzq != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoIzq().preOrden());
        }
        if (hijoDer != null) {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().preOrden());
        }
        return tempStr.toString();
    }

    /**
     * @return recorrida en postOrden del subArbol que cuelga del elemento
     * actual
     */
    public String postOrden() {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null) {
            tempStr.append(getHijoIzq().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (hijoDer != null) {
            tempStr.append(getHijoDer().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        return tempStr.toString();
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * @return
     */
    public String imprimir() {
        return (etiqueta.toString());
    }

    @Override
    public T getDatos() {
        return datos;
    }

    @Override
    public void setHijoIzq(IElementoAB elemento) {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(IElementoAB elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public IElementoAB eliminar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzq != null) {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0) {
            if (this.hijoDer != null) {
                this.hijoDer = hijoDer.eliminar(unaEtiqueta);

            }
            return this;
        }

        return quitaElNodo();
    }

    private IElementoAB quitaElNodo() {
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
    public int altura() {
        int alturaIzq = -1;
        int alturaDer = -1;

        if (hijoIzq != null) {
            alturaIzq = hijoIzq.altura();
        }

        if (hijoDer != null) {
            alturaDer = hijoDer.altura();
        }
        return Math.max(alturaIzq, alturaDer) + 1;

    }

    @Override
    public int tamanio() {
        int taIzq = 0;
        int taDer = 0;

        if (hijoIzq != null) {
            taIzq = taIzq + hijoIzq.tamanio();
        }
        if (hijoDer != null) {
            taDer = taDer + hijoDer.tamanio();
        }
        return taIzq + taDer + 1;
    }

    @Override
    public int niveles(Comparable unaEtiqueta) {
        int nivelIzq = -1;
        int nivelDer = -1;

        if (this.etiqueta == unaEtiqueta) {
            return 0;
        }

        if (hijoIzq != null) {
            if (etiqueta != unaEtiqueta) {
                nivelIzq = hijoIzq.niveles(unaEtiqueta);
            }

        }
        if (hijoDer != null) {
            if (etiqueta != unaEtiqueta) {
                nivelDer = hijoDer.niveles(unaEtiqueta);
            }
        }

        if (nivelIzq > -1) {
            return nivelIzq + 1;
        } else if (nivelDer > -1) {
            return nivelDer + 1;
        }

        return -1;

    }

    @Override
    public int cantidadHojas() {
        int cantidadHI = 0;
        int cantidadHD = 0;

        if (hijoIzq != null) {
            cantidadHI = hijoIzq.cantidadHojas();
        }
        if (hijoDer != null) {
            cantidadHD = hijoDer.cantidadHojas();
        }
        if (hijoIzq == null && hijoDer == null) {
            return 1;
        }
        return cantidadHI + cantidadHD;
    }

    @Override
    public String listarHojas() {
        String hojasI = new String();
        String hojasD = new String();

        if (hijoIzq != null) {
            hojasI = hijoIzq.listarHojas();
        }
        if (hijoDer != null) {
            hojasD = hijoDer.listarHojas();
        }
        if (hijoIzq == null && hijoDer == null) {
            return this.etiqueta.toString();
        }
        return hojasI + hojasD;
    }

    @Override
    public IElementoAB minimo() {
        if (hijoIzq != null) {
            return hijoIzq.minimo();
        }
        return this;

    }

    @Override
    public IElementoAB maximo() {
        if (hijoDer != null) {
            return hijoDer.maximo();

        }
        return this;
    }

    @Override
    public IElementoAB lexicoAnterior(Comparable unaClave) {

        /* if (this.etiqueta.compareTo(unaClave) == 0) {
            return null;
        }*/
        if (unaClave.compareTo(hijoIzq.getEtiqueta()) < 0) {
            return hijoIzq.lexicoAnterior(unaClave);
        }
        if (unaClave.compareTo(hijoIzq.getEtiqueta()) > 0) {
            return hijoDer.lexicoAnterior(unaClave);
        }
        if (unaClave.compareTo(hijoIzq.getEtiqueta()) == 0
                || (unaClave.compareTo(hijoDer.getEtiqueta()) == 0)) {
            return this;
        }
        return null;
    }

    @Override
    public int sumarClavesNivel(int n) {
        if (n == 0) {
            return Integer.valueOf(this.etiqueta.toString());
        } else {
            int x = 0;
            int y = 0;
            if (this.hijoIzq != null) {
                x = this.hijoIzq.sumarClavesNivel(n - 1);
            }
            if (this.hijoDer != null) {
                y = this.hijoDer.sumarClavesNivel(n - 1);
            }

            return x + y;
        }

    }

    @Override
    public int sumarClavesHojas() {
        int hojasIzq = 0;
        int hojasDer = 0;

        if (hijoIzq != null) {
            hojasIzq = hijoIzq.sumarClavesHojas();
        }

        if (hijoDer != null) {
            hojasDer = hijoDer.sumarClavesHojas();
        }
        if (hijoIzq == null && hijoDer == null) {
            return Integer.valueOf(this.etiqueta.toString());
        }

        return hojasIzq + hojasDer;
    }

    @Override
    public int contarNodosInternos() {
        int x = 0;
        int y = 0;
        if (hijoIzq == null && hijoDer == null) {
            return 0;
        }
        if (hijoIzq != null) {
            x = hijoIzq.contarNodosInternos();
        }
        if (hijoDer != null) {
            y = hijoDer.contarNodosInternos();
        }
        return x + y + 1;
    }

    @Override
    public int sumarNodosInternos() {
        int x = 0;
        int y = 0;
        if (hijoIzq == null && hijoDer == null) {
            return 0;
        }
        if (hijoIzq != null) {
            x = hijoIzq.sumarNodosInternos();
        }
        if (hijoDer != null) {
            y = hijoDer.sumarNodosInternos();
        }
        return x + y + Integer.valueOf(this.etiqueta.toString());
    }

    @Override
    public int sumaEtiquetas() {
        int x = 0;
        int y = 0;

        if (hijoIzq != null) {
            x = x + hijoIzq.sumaEtiquetas();
        }
        if (hijoDer != null) {
            y = y + hijoDer.sumaEtiquetas();

        }
        return x + y + Integer.valueOf(this.etiqueta.toString());
    }
    
    @Override
    public boolean esBusqueda (){
        if (hijoIzq == null && hijoDer == null){
            return true;
        }
        if (hijoIzq != null){
            if( hijoIzq.getEtiqueta().compareTo(this.getEtiqueta())>0){
                hijoIzq.esBusqueda();
        }
        }
    }

}
