package parcial3.ArbolesEInterfaces;

public interface IArbolBB<T> {

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operaci�n
     */

    public boolean insertar(IElementoAB unElemento);

    
    /**
     * Busca un elemento dentro del �rbol.
     *
     * Ejemplo de uso del contador:
     *
     * Integer[] contador = new Integer[1]; contador[0] = new Integer(0);
     * IElemento elem = arbol.buscar(10635, contador);
     * System.out.println(contador[0]); // imprime la cantidad de llamadas para
     * buscar a 10635
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * @param Vector de 1 solo elemento conteniendo el contador de llamadas.
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador);

    /**
     * Imprime en PreOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Imprime en InOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String inOrden();

    /**
     * Imprime en PostOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String postOrden();

    /**
     * Retorna la altura del arbol.
     *
     * @return Altura del arbol.
     */
    public int obtenerNivel(Comparable unaEtiqueta);

    /**
     * Retorna la cantidad de hojas del arbol.
     *
     * @return Cantidad de hojas del arbol.
     */
    public int calcularCostoExito(int[] frecExito, int nivel, int[] contador);

    public int calcularCostoNoExito(int[] frecNoExito);

    public int calcularCosto(int[] frecExito, int[] frecNoExito);

}
