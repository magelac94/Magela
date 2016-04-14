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
public class Matriz {

    public void MultiplicarMatrices(int[][] one, int[][] two) {
        int columnasPrimero = one.length;
        int filasPrimero = one[0].length;
        int columnasSegundo = two.length;
        int filasSegundo = two[0].length;
        int[][] resultado = new int[filasPrimero][columnasSegundo];
        //resetear matriz a 0
        int j = 0;
        int k = 0;

        if (columnasPrimero == filasSegundo) {
            while (k < columnasSegundo) {
                for (int h = 0; h < filasSegundo; h++) {
                    while (j < filasPrimero) {

                        for (int i = 0; i < columnasPrimero; i++) {
                            resultado[h][k] += one[j][i] * two[h][k];
                        }
                    }
                }
            }
         Imprimir(resultado);
        } else {
            System.out.println("No se puede aplicar multiplicacion de Matrices");
        }
       // return null;
    }

    public void Imprimir(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                System.out.println(ma[i][j]);
            }

        }

    }
}
