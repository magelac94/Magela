/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

/**
 *
 * @author Magela
 */
public class Principal {

    public static void main (String[] arg) {
        Matriz nuevaMatriz = new Matriz();

        int[][] matriz1 = {{2, 2}, {3, 3}, {4, 4}};
        int[][] matriz2 = {{1, 1}, {8, 8}, {9, 9}};
        
        
        
        nuevaMatriz.MultiplicarMatrices(matriz1, matriz2);

    }

}
