/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedordenumeros;

/**
 *
 * @author Magela
 */
public class ContenedorDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NumberHolder nh = new NumberHolder();
        System.out.println(" anInt = "+nh.anInt);
        System.out.println(" aFloat = "+nh.aFloat);
        
        nh.anInt =  3;
        nh.aFloat = 5;
        
        System.out.println(" anInt = "+nh.anInt);
        System.out.println(" aFloat = "+nh.aFloat);
    }

}
