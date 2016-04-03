/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_cartas;

/**
 * Clase principal para ejecutar programa
 *
 * @author Magela
 */
public class Ej2_cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mazo ma = new Mazo(); // Creo un mazo de cartas
        int i;
        for (i = 0; i < 48; i++) {
            System.out.println(ma.mazo[i].MostrarCarta()); // Imprimo el mazo
        }

    }
}
