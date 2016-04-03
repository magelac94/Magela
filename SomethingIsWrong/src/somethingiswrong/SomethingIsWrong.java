/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingiswrong;

/**
 *
 * @author Magela
 */
public class SomethingIsWrong {

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());

        
        
        String[] students = new String[10];
        String studentName = "Peter Parker";
        
        students[0] = studentName;
        studentName = null;
    }

}
