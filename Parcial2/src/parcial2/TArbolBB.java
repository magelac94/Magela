package parcial2;

/**
 * @author Programacion2
 * @param <T>
 *
 */
public class TArbolBB<T> implements IArbolBB<T> {

    private IElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    public boolean insertar(IElementoAB<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @SuppressWarnings("unchecked")
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    /**
     * @return recorrida en inorden del arbol, null en caso de ser vacío
     */
    public String inOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.inOrden();
        }
    }

    /**
     * @return recorrida en preOrden del arbol, null en caso de ser vacío
     */
    public String preOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.preOrden();
        }
    }

    /**
     * @return recorrida en postOrden del arbol, null en caso de ser vacío
     */
    public String postOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.postOrden();
        }
    }

    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }

    /**
     * @return
     */
    public boolean esVacio() {
        return (raiz == null);
    }

    public int altura() {
        if (raiz != null) {
            return raiz.altura();
        }
        return -1;
    }

    public int tamanio() {
        if (raiz != null) {
            return raiz.tamanio();
        }
        return 0;
    }

    public int niveles(Comparable et) {
        if (raiz != null) {
            return raiz.niveles(et);
        }
        return -1;
    }

    public int cantidadHojas() {
        if (raiz != null) {
            return raiz.cantidadHojas();
        }
        return 0;
    }
    
    public String listarHojas(){
        if (raiz != null){
            return raiz.listarHojas();
        }
        return "0";
    }
    
    public IElementoAB minimo(){
        if (raiz != null){
            return raiz.minimo();
        }
        return null;
    }
    
    public IElementoAB maximo(){
        if (raiz!= null){
            return raiz.maximo();
        }   return null;
    }
    
    public IElementoAB lexicoAnterior(Comparable unaClave){
        if (raiz != null){
            return raiz.lexicoAnterior(unaClave);
        }   return null;
    }

}
