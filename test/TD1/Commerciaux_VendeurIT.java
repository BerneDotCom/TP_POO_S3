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
public class Commerciaux_VendeurIT {
    
    public Commerciaux_VendeurIT() {
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
     * Test of calculerSalaireBrut method, of class Commerciaux_Vendeur.
     */
    @Test
    public void testCalculerSalaireBrut() {
        System.out.println("calculerSalaireBrut");
        Commerciaux_Vendeur instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaireBrut();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChiffre_affaire method, of class Commerciaux_Vendeur.
     */
    @Test
    public void testGetChiffre_affaire() {
        System.out.println("getChiffre_affaire");
        Commerciaux_Vendeur instance = null;
        double expResult = 0.0;
        double result = instance.getChiffre_affaire();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChiffre_affaire method, of class Commerciaux_Vendeur.
     */
    @Test
    public void testSetChiffre_affaire() {
        System.out.println("setChiffre_affaire");
        double chiffre_affaire = 0.0;
        Commerciaux_Vendeur instance = null;
        instance.setChiffre_affaire(chiffre_affaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaux_commission method, of class Commerciaux_Vendeur.
     */
    @Test
    public void testGetTaux_commission() {
        System.out.println("getTaux_commission");
        Commerciaux_Vendeur instance = null;
        double expResult = 0.0;
        double result = instance.getTaux_commission();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaux_commission method, of class Commerciaux_Vendeur.
     */
    @Test
    public void testSetTaux_commission() {
        System.out.println("setTaux_commission");
        double taux_commission = 0.0;
        Commerciaux_Vendeur instance = null;
        instance.setTaux_commission(taux_commission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
