/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

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
public class TDAArbolOptimoIT {

    public TDAArbolOptimoIT() {
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
     * Test of encontrarOptimo method, of class TDAArbolOptimo.
     */
    @Test
    public void testEncontrarOptimo() {

        System.out.println("encontrarOptimo");
        int cantElem = 3;
        int[] frecExito = {0, 2, 4, 3};
        int[] frecNoExito = {6, 4, 2, 4};
        TDAArbolOptimo instance = new TDAArbolOptimo(3);
        instance.encontrarOptimo(cantElem, frecExito, frecNoExito);
       
    }
    
    /**
     * Test of encontrarOptimo method, of class TDAArbolOptimo.
     */
    @Test
    public void testEncontrarOptimoNull() {

        System.out.println("encontrarOptimo");
        int cantElem = 3;
        int[] frecExito = {};
        int[] frecNoExito = {};
        TDAArbolOptimo instance = new TDAArbolOptimo(0);
        instance.encontrarOptimo(cantElem, frecExito, frecNoExito);
       
    }
    

    /**
     * Test of armarArbolBinario method, of class TDAArbolOptimo.
     */
    @Test
    public void testArmarArbolBinario() {
        System.out.println("armarArbolBinario");
        int i = 0;
        int j = 0;
        String[] claves = {"","B","E","I"};
        TDAArbolOptimo instance = new TDAArbolOptimo(3);
        instance.armarArbolBinario(i, j, claves);
       
    }
    
     /**
     * Test of armarArbolBinario method, of class TDAArbolOptimo.
     */
    @Test
    public void testArmarArbolBinarioNull() {
        System.out.println("armarArbolBinario");
        int i = 0;
        int j = 0;
        String[] claves = {""};
        TDAArbolOptimo instance = new TDAArbolOptimo(0);
        instance.armarArbolBinario(i, j, claves);
       
    }

        /**
     * Test of calcularCosto method, of class TDAArbolOptimo.
     */
    @Test
    public void testCalcularCosto() {
        System.out.println("calcularCosto");
        int[] frecExito = {0, 2, 4, 3};
        int[] frecNoExito = {6, 4, 2, 4};
        TDAArbolOptimo instance = new TDAArbolOptimo(3);
        int expResult = 25;
        int result = instance.calcularCosto(frecExito, frecNoExito);
        assertEquals(expResult, result);
        
    }
    
       /**
     * Test of calcularCosto method, of class TDAArbolOptimo.
     */
    @Test
    public void testCalcularCosto2() {
        System.out.println("calcularCosto");
        int[] frecExito = {};
        int[] frecNoExito = {};
        TDAArbolOptimo instance = new TDAArbolOptimo(0);
        int expResult = 0;
        int result = instance.calcularCosto(frecExito, frecNoExito);
        assertEquals(expResult, result);
        
    }
    
       /**
     * Test of calcularCosto method, of class TDAArbolOptimo.
     */
    @Test
    public void testCalcularCosto3() {
        System.out.println("calcularCosto");
        int[] frecExito = { 0, 2, 4, 3};
        int[] frecNoExito = {6, 4, 2, 4};
        TDAArbolOptimo instance = new TDAArbolOptimo(3);
        int expResult = 25;
        int result = instance.calcularCosto(frecExito, frecNoExito);
        assertEquals(expResult, result);
        
    }

    

}
