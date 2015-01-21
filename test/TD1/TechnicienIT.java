/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;

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
public class TechnicienIT {
    
    public TechnicienIT() {
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
     * Test of calculerSalaireBrut method, of class Technicien.
     */
    @Test
    public void testCalculerSalaireBrut() {
        System.out.println("calculerSalaireBrut");
        Technicien instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaireBrut();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNb_unites method, of class Technicien.
     */
    @Test
    public void testGetNb_unites() {
        System.out.println("getNb_unites");
        Technicien instance = null;
        double expResult = 0.0;
        double result = instance.getNb_unites();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNb_unites method, of class Technicien.
     */
    @Test
    public void testSetNb_unites() {
        System.out.println("setNb_unites");
        double nb_unites = 0.0;
        Technicien instance = null;
        instance.setNb_unites(nb_unites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaux_commission method, of class Technicien.
     */
    @Test
    public void testGetTaux_commission() {
        System.out.println("getTaux_commission");
        Technicien instance = null;
        double expResult = 0.0;
        double result = instance.getTaux_commission();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaux_commission method, of class Technicien.
     */
    @Test
    public void testSetTaux_commission() {
        System.out.println("setTaux_commission");
        double taux_commission = 0.0;
        Technicien instance = null;
        instance.setTaux_commission(taux_commission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
