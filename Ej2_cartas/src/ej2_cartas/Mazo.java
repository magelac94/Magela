/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_cartas;

/**
 * Clase Mazo, se generan 48 cartas y se guardan en el mazo el mazo es un array
 * de cartas
 *
 * @author Magela
 */
public class Mazo {

    Carta[] mazo = new Carta[49]; // mazo

    /**
     * Contructor, cuando se crea un mazo se crean 48 cartas del 12 de los
     * cuatro palos
     */
    public Mazo() {
        int j;
        int cont = 0;

        // Creacion cartas Espada
        for (j = 1; j <= 12; j++) {
            mazo[cont] = new Carta();
            mazo[cont].Numero(j);
            mazo[cont].Palo("Espada");
            cont++;
        }
        
        // Creacion cartas Basto
        for (j = 1; j <= 12; j++) {
            mazo[cont] = new Carta();
            mazo[cont].Numero(j);
            mazo[cont].Palo("Basto");
            cont++;
        }
        
        // Creacion cartas Oro
        for (j = 1; j <= 12; j++) {
            mazo[cont] = new Carta();
            mazo[cont].Numero(j);
            mazo[cont].Palo("Oro");
            cont++;
        }
        
        // Creacion cartas Copa
        for (j = 1; j <= 12; j++) {
            mazo[cont] = new Carta();
            mazo[cont].Numero(j);
            mazo[cont].Palo("Copa");
            cont++;
        }

    }
}
