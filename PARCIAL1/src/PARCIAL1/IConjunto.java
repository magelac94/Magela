package PARCIAL1;

public interface IConjunto<E> extends ILista<E> {

    /**
     * M�todo encargado de agregar un nodo al final del conjunto.
     *
     * @param nodo - Nodo a agregar
     */
       @Override
       public void insertar(INodo<E> nodo);
     
   
    /**
     * Devuelve el complemento del conjunto en el conjunto Universal pasado 
     * por parámetro
     * @param conjuntoUniversal
     * @return
     */
    public IConjunto complemento (IConjunto conjuntoUniversal);
}
