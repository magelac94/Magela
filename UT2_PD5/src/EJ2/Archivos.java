/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Magela
 */
public class Archivos {

    public static String[] leerArchivo(String nombreCompletoArchivo) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        try {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            if (true) {
                lineaActual = br.readLine();
            }
            while (lineaActual != null) {
                listaLineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
//		System.out.println("Archivo leido satisfactoriamente");

        return listaLineasArchivo.toArray(new String[0]);
    }

    public static void escribir(int par1, float par2, String par3) {
        System.out.println("El entero leido es: " + par1);
        System.out.println("El numero de punto flotante es: " + par2);
        System.out.println("La cadena leida es " + par3);
        System.out.println("!Hola " + par3 + " La suma de " + par1 + " y " + par2 + " es " + par1 + par2);
        //   System.out.println("La division entera de "+par2+" y "+par1+" es "+par2/par1+" y su resto es "+(par2%part1));

    }

    public static void main(String[] arg) {
        int parametro1;
        float parametro2;
        String parametro3;
        String[] lineas = leerArchivo("src/EJ2/entrada.txt");

        parametro1 = Integer.valueOf(lineas[0]);
        parametro2 = Float.valueOf(lineas[1]);
        parametro3 = lineas[2];
        escribir(parametro1, parametro2, parametro3);

        // Parte 2 -- 
        String[] cir = leerArchivo("src/EJ2/radio.txt");
        float radio = Float.valueOf(cir[0]);
        System.out.println("Area: " + (Math.PI * radio * radio) / 2);
        System.out.println("Perimetro: " + (radio + radio) * Math.PI);

    }
}