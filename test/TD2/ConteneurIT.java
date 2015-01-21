/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Val
 */
public class ConteneurIT {
    
    public ConteneurIT() {
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
     * Test of getDestination method, of class Conteneur.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Conteneur instance = null;
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoids method, of class Conteneur.
     */
    @Test
    public void testGetPoids() {
        System.out.println("getPoids");
        Conteneur instance = null;
        int expResult = 0;
        int result = instance.getPoids();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerTarif method, of class Conteneur.
     */
    @Test
    public void testCalculerTarif() {
        System.out.println("calculerTarif");
        Conteneur instance = null;
        double expResult = 0.0;
        double result = instance.calculerTarif();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalculeTarif method, of class Conteneur.
     */
    @Test
    public void testSetCalculeTarif() {
        System.out.println("setCalculeTarif");
        Tarif tarif = null;
        Conteneur instance = null;
        instance.setCalculeTarif(tarif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpediteur method, of class Conteneur.
     */
    @Test
    public void testGetExpediteur() {
        System.out.println("getExpediteur");
        Conteneur instance = null;
        String expResult = "";
        String result = instance.getExpediteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Conteneur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Conteneur instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
