/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_cartas;

/**
 * Clase Carta
 *
 * @author Magela
 */
public class Carta {

    /**
     * Contiene un String con el palo de la carta
     */
    public String palo;

    /**
     * Contiene el numero de la carta
     */
    public int numero;

    /**
     * Asigna un palo a la carta
     *
     * @param palo
     */
    public void Palo(String palo) {
        this.palo = palo;
    }

    /**
     * Asigna un numero a la carta
     *
     * @param numero
     */
    public void Numero(int numero) {
        this.numero = numero;
    }

    /**
     * Metodo que retorna un String para imprimir con el Numero y Palo de una
     * carta
     *
     * @return Numero y Palo de la carta
     */
    public String MostrarCarta() {

        return "Numero: " + String.valueOf(numero) + ", Palo: " + palo;
    }
}
