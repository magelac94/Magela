/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import javax.swing.DefaultListModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magela
 */
public class InterfazIT {
    
    public InterfazIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cargarEstrenos method, of class Interfaz.
     */
    @Test
    public void testCargarEstrenos() {
        System.out.println("cargarEstrenos");
        Interfaz instance = new Interfaz();
        instance.cargarEstrenos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarPanelIzquiero method, of class Interfaz.
     */
    @Test
    public void testCargarPanelIzquiero() {
        System.out.println("CargarPanelIzquiero");
        DefaultListModel panel = null;
        Pelicula peli = null;
        Interfaz instance = new Interfaz();
        instance.CargarPanelIzquiero(panel, peli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Interfaz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Interfaz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
