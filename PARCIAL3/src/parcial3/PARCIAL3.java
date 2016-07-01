/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author Magela
 */
public class PARCIAL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadElementos = 7;

        // Creacion de Vectores
        String[] claves = {"","BMW", "Chery", "Chevrolet", "Citroen", "Ford", "Mazda", "Suzuki" };
        int[] frecExito = {0,10, 1, 2, 4, 3, 6, 8};
        int[] frecNoExito = {0, 5, 3, 2, 1, 5, 6, 3, 9};

        // Creacion de Arbol Binario Optimo
        TDAArbolOptimo arbol = new TDAArbolOptimo(cantidadElementos);
        
        // Buscar Arbol Binario Optimo - Imprime en pantalla - 
        arbol.encontrarOptimo(cantidadElementos, frecExito, frecNoExito);
        
        // Armar Arbol Optimo
        arbol.armarArbolBinario(0, cantidadElementos, claves);

        // Recorridos
        System.out.println("Inorden: " + arbol.inOrden());
        System.out.println("PreOrden: " + arbol.preOrden());

        // Calcular Costo
        System.out.println(arbol.calcularCosto(frecExito, frecNoExito));
    }
}
