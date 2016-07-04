/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import interfaces.IElementoAB;
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
public class TElementoArbolBBIT {
    
    public TElementoArbolBBIT() {
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
     * Test of getEtiqueta method, of class TElementoArbolBB.
     */
    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        TElementoArbolBB instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoIzq method, of class TElementoArbolBB.
     */
    @Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoDer method, of class TElementoArbolBB.
     */
    @Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoIzq method, of class TElementoArbolBB.
     */
    @Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        IElementoAB elemento = null;
        TElementoArbolBB instance = null;
        instance.setHijoIzq(elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoDer method, of class TElementoArbolBB.
     */
    @Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        IElementoAB elemento = null;
        TElementoArbolBB instance = null;
        instance.setHijoDer(elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TElementoArbolBB.
     */
    @Test
    public void testBuscar_Comparable_IntegerArr() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        Integer[] contador = null;
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TElementoArbolBB.
     */
    @Test
    public void testBuscar_Comparable() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TElementoArbolBB.
     */
    @Test
    public void testInsertar_IElementoAB_IntegerArr() {
        System.out.println("insertar");
        IElementoAB elemento = null;
        Integer[] contador = null;
        TElementoArbolBB instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(elemento, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TElementoArbolBB.
     */
    @Test
    public void testInsertar_IElementoAB() {
        System.out.println("insertar");
        IElementoAB elemento = null;
        TElementoArbolBB instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(elemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTamanio method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerTamanio() {
        System.out.println("obtenerTamanio");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNivel method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        Integer[] nivel = null;
        TElementoArbolBB instance = null;
        instance.obtenerNivel(unaEtiqueta, nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarHojas method, of class TElementoArbolBB.
     */
    @Test
    public void testListarHojas() {
        System.out.println("listarHojas");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.listarHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMinimo method, of class TElementoArbolBB.
     */
    @Test
    public void testEncontrarMinimo() {
        System.out.println("encontrarMinimo");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.encontrarMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMaximo method, of class TElementoArbolBB.
     */
    @Test
    public void testEncontrarMaximo() {
        System.out.println("encontrarMaximo");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.encontrarMaximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lexicograficamenteAnterior method, of class TElementoArbolBB.
     */
    @Test
    public void testLexicograficamenteAnterior() {
        System.out.println("lexicograficamenteAnterior");
        Comparable unaClave = null;
        IElementoAB unElemento = null;
        TElementoArbolBB instance = null;
        instance.lexicograficamenteAnterior(unaClave, unElemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class TElementoArbolBB.
     */
    @Test
    public void testGetDatos() {
        System.out.println("getDatos");
        TElementoArbolBB instance = null;
        Object expResult = null;
        Object result = instance.getDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TElementoArbolBB.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.eliminar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarElNodo method, of class TElementoArbolBB.
     */
    @Test
    public void testQuitarElNodo() {
        System.out.println("quitarElNodo");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.quitarElNodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarClavesNivel method, of class TElementoArbolBB.
     */
    @Test
    public void testSumarClavesNivel() {
        System.out.println("sumarClavesNivel");
        int n = 0;
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.sumarClavesNivel(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoExito method, of class TElementoArbolBB.
     */
    @Test
    public void testCalcularCostoExito() {
        System.out.println("calcularCostoExito");
        int[] frecExito = null;
        int nivel = 0;
        int[] contador = null;
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.calcularCostoExito(frecExito, nivel, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoNoExito method, of class TElementoArbolBB.
     */
    @Test
    public void testCalcularCostoNoExito() {
        System.out.println("calcularCostoNoExito");
        int[] frecNoExito = null;
        int nivel = 0;
        int[] contador = null;
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.calcularCostoNoExito(frecNoExito, nivel, contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCosto method, of class TElementoArbolBB.
     */
    @Test
    public void testCalcularCosto() {
        System.out.println("calcularCosto");
        int[] frecExito = null;
        int[] frecNoExito = null;
        int nivel = 0;
        int[] contadorExito = null;
        int[] contadorNoExito = null;
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.calcularCosto(frecExito, frecNoExito, nivel, contadorExito, contadorNoExito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
