/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author DC-C04
 */
public class Auxiliares {

    // Le paso un string para buscar en otro String
    public static boolean contieneA(String palabraABuscar, String stringDondeBusco) {

        System.out.println("Palabra a buscar:" + palabraABuscar);
        System.out.println("String Inicial:" + stringDondeBusco);

      //  stringDondeBusco = quitarSimbolos(stringDondeBusco);
        System.out.println("String sin Simbolos:" + stringDondeBusco);

        String[] palabrasSeparadas = stringDondeBusco.split(" ");
        System.out.println("Palabras Separadas:" + palabrasSeparadas);

    /*    for (int i = 0; i < palabrasSeparadas.length; i++) {
            if (palabrasSeparadas[i].equals(palabraABuscar)) {
                
                return true;
            }
        }*/
        return false;
    }
/*
    public static String quitarSimbolos(String str) {
        char[] aCaracteres = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (isSymbol(aCaracteres[i])) {
                aCaracteres[i] = ' ';
            }
        }
        str = String.valueOf(aCaracteres);

        return str;
    }

    public static boolean isSymbol(char a) {
        char symbolos[] = {',', '.', '-', ';', ':'};
        for (int i = 0; i < symbolos.length; i++) {
            if (symbolos[i] == a) {
                return true;
            }

        }
        return false;
    } */

}
