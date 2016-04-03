/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Magela
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
  //  public static int x = 7;
   // public int y = 3;
 
    public static void main(String[] args) {

        id a = new id();
        id b = new id();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + id.x);
    }
}
