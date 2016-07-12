/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class RadioATest {
    
    public RadioATest() {
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
     * Test of setEstado method, of class RadioA.
     */
    @org.junit.Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        RadioA instance = new RadioA();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class RadioA.
     */
    @org.junit.Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean frecuencia = false;
        RadioA instance = new RadioA();
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmisora method, of class RadioA.
     */
    @org.junit.Test
    public void testSetEmisora() {
        System.out.println("setEmisora");
        double emisora = 0.0;
        RadioA instance = new RadioA();
        instance.setEmisora(emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmisoraS method, of class RadioA.
     */
    @org.junit.Test
    public void testSetEmisoraS() {
        System.out.println("setEmisoraS");
        double[] emisoraS = null;
        RadioA instance = new RadioA();
        instance.setEmisoraS(emisoraS);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class RadioA.
     */
    @org.junit.Test
    public void testIsEstado() {
        System.out.println("isEstado");
        RadioA instance = new RadioA();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFrecuencia method, of class RadioA.
     */
    @org.junit.Test
    public void testIsFrecuencia() {
        System.out.println("isFrecuencia");
        RadioA instance = new RadioA();
        boolean expResult = false;
        boolean result = instance.isFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmisora method, of class RadioA.
     */
    @org.junit.Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        RadioA instance = new RadioA();
        double expResult = 0.0;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmisoraS method, of class RadioA.
     */
    @org.junit.Test
    public void testGetEmisoraS() {
        System.out.println("getEmisoraS");
        RadioA instance = new RadioA();
        double[] expResult = null;
        double[] result = instance.getEmisoraS();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmisora method, of class RadioA.
     */
    @org.junit.Test
    public void testSaveEmisora() {
        System.out.println("saveEmisora");
        int btn = 0;
        double emisoraS = 0.0;
        RadioA instance = new RadioA();
        instance.saveEmisora(btn, emisoraS);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectEmisora method, of class RadioA.
     */
    @org.junit.Test
    public void testSelectEmisora() {
        System.out.println("selectEmisora");
        int btn = 0;
        RadioA instance = new RadioA();
        double expResult = 0.0;
        double result = instance.selectEmisora(btn);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class RadioA.
     */
    @org.junit.Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        RadioA instance = new RadioA();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class RadioA.
     */
    @org.junit.Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        RadioA instance = new RadioA();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncendido method, of class RadioA.
     */
    @org.junit.Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean estado = false;
        RadioA instance = new RadioA();
        instance.setEncendido(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
