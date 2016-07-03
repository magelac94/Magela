package interfaces;

public interface IElementoAB<T> {
	/**
	 * Obtiene el valor de la etiqueta del nodo.
	 * @return Etiqueta del nodo.
	 */
	public Comparable getEtiqueta();
        
	
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
	public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador);
        public IElementoAB buscar(Comparable unaEtiqueta);
	
	/**
	 * 
	 * Inserta un elemento dentro del arbol.
	 *  en el contador devuelve la cantidad de llamadas realizadas
	 * @param elemento Elemento a insertar.
	 * @return Exito de la operaci�n.
	 * 	 * @param contador Vector de 1 solo elemento conteniendo el contador de llamadas
	 * @return Exito de la operaci�n
	 */
	
	public boolean insertar(IElementoAB elemento, Integer[] contador);
	
	/**
         * Elimina un elemento a partir de una etiqueta pasada por parametro
         * @param unaEtiqueta etiqueta del nodo a eliminar
         * @return 
         */
        public IElementoAB eliminar(Comparable unaEtiqueta);
                
    
	
	/**
	 * Inserta un elemento dentro del arbol.
	 * @param elemento Elemento a insertar.
	 * @return Exito de la operaci�n.
	 */
	public boolean insertar(IElementoAB elemento);
	
	/**
	 * Imprime en preorden el arbol separado por guiones. 
	 * @return String conteniendo el PreOrden
	 */
	public String preOrden();
	
	/**
	 * Imprime en inorden el arbol separado por guiones. 
	 * @return String conteniendo el InOrden
	 */
	public String inOrden();
	
	/**
	 * Imprime en postorden el arbol separado por guiones. 
	 * @return String conteniendo el PostOrden
	 */
	public String postOrden();
	
	/**
	 * Retorna la altura del arbol cuya raiz es la del nodo actual.
	 * @return Altura del subarbol.
	 */
	public int obtenerAltura();
	
	/**
	 * Retorna el tama�o del arbol cuya raiz es la del nodo actual.
	 * @return Tama�o del subarbol.
	 */
	public int obtenerTamanio();
	
	/**
	 * Setea el nivel que tiene un nodo pasado por parametro
	 * @param unaEtiqueta
         * @param nivel
	 * 
	 */
	public void obtenerNivel(Comparable unaEtiqueta,Integer[] nivel);
	
	/**
	 * Retorna la cantidad de hojas del arbol cuya raiz es la del nodo actual.
	 * @return Cantidad de hojas del subarbol.
	 */
	public int obtenerCantidadHojas();

	/**
	 * Lista las hojas del subarbol junto con su nivel.
	 */
	public int listarHojas();

	/**
	 * Retorna el elemento cuya clave es la m�nima del subarbol.
	 * @return Clave m�nima del subarbol.
	 */
	public IElementoAB encontrarMinimo();

	/**
	 * Retorna el elemento cuya clave es la maxima del subarbol.
	 * @return Clave m�xima del subarbol.
	 */
	public IElementoAB encontrarMaximo();
	
	/**
	 * Retorna el elemento inmediatamente anterior.
	 * @return
	 */
	public void lexicograficamenteAnterior(Comparable unaClave, IElementoAB unElemento);
        
       /**
	 * Retorna los datos contenidos en el elemento.
	 * @return
	 */
        public T getDatos();
        
        /**
         * Quita el nodo 
         * @return Nodo sustituto al quitado
         */
        public IElementoAB quitarElNodo();
        
        public int sumarClavesNivel(int n);
        public int calcularCostoExito(int[] frecExito,int nivel,int[] contador );
        public int calcularCostoNoExito(int[] frecNoExito, int nivel, int[] contador);
        public int calcularCosto(int[] frecExito,int[] frecNoExito,int nivel,int[] contadorExito,int[] contadorNoExito );
        
}
