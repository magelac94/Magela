package ut5.ta2;

import ut5.ta2.IElementoAB;

public interface IElementoAB {
	/**
	 * Obtiene el valor de la etiqueta del nodo.
	 * @return Etiqueta del nodo.
	 */
	public Comparable getEtiqueta();
	
	public void setEtiqueta(Comparable unaEtiqueta);
	
	/**
	 * Obtiene el hijo izquierdo del nodo.
	 * @return Hijo Izquierdo del nodo.
	 */
	public IElementoAB getHijoIzq();
	
	/**
	 * Obtiene el hijo derecho del nodo.
	 * @return Hijo derecho del nodo.
	 */
	public IElementoAB getHijoDer();
	
	/**
	 * Asigna el hijo izquierdo del nodo.
	 * @return Elemento a ser asignado como hijo izquierdo.
	 */
	public void setHijoIzq(IElementoAB elemento);

	/**
	 * Asigna el hijo derecho del nodo.
	 * @return Elemento a ser asignado como hijo derecho.
	 */
	public void setHijoDer(IElementoAB elemento);

	/**
	 * Busca un elemento dentro del arbol con la etiqueta indicada.
	 * @param unaEtiqueta del nodo a buscar
	 * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
	 */
	public IElementoAB buscar(Comparable unaEtiqueta);
	public IElementoAB buscar(Comparable unaEtiqueta,int[] contador);
	
	/**
	 * Inserta un elemento dentro del arbol.
	 * @param elemento Elemento a insertar.
	 * @return Exito de la operación.
	 */
	public boolean insertar(IElementoAB elemento);
	public boolean insertar(IElementoAB elemento, int[] contador);
	
	/**
	 * Imprime en preorden el arbol separado por guiones. 
	 * @return String conteniendo el PreOrden
	 */
	public String preOrden();
	public String inOrden();
	public String postOrden();
	public int getAltura();
	public int getNivel(Comparable unaEtiqueta);
	public int cantidadDeHojas(IElementoAB nodo);
	public int taamaño();
	public int contarNivel(int nivelA,int nivel);
	public void completarNodosExternos(int[] vectorBetas, Integer[] contador);
	public void obtenerCosto(int[] costo, int nivel);
}
