package ut5.ta2;

import ut5.ta2.IElementoAB;

public interface IArbolBB {
	/**
	 * Inserta un elemento en el arbol. En caso de ya existir un elemento
	 * con la clave indicada en "unElemento", retorna falso.
	 * @param unElemento Elemento a insertar
	 * @return Exito de la operación
	 */
	public boolean insertar(IElementoAB unElemento);
	public boolean insertarContador(IElementoAB unElemento);
	
	/**
	 * Busca un elemento dentro del árbol.
	 * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
	 * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
	 */
	public IElementoAB buscar(Comparable unaEtiqueta);
	
	
	/**
	 * Imprime en PreOrden los elementos del árbol, separados por guiones.
	 * @return String conteniendo el preorden separado por guiones.
	 */
	public String preOrden();
	public String inOrden();
	public String postOrden();
}

