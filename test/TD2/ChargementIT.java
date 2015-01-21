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
public class ChargementIT {
    
    public ChargementIT() {
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
     * Test of embarquer method, of class Chargement.
     */
    @Test
    public void testEmbarquer() {
        System.out.println("embarquer");
        Conteneur conteneur = null;
        Chargement instance = new Chargement();
        instance.embarquer(conteneur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of debarquer method, of class Chargement.
     */
    @Test
    public void testDebarquer() {
        System.out.println("debarquer");
        Chargement instance = new Chargement();
        instance.debarquer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
