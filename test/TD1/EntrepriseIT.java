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
public class EntrepriseIT {
    
    public EntrepriseIT() {
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
     * Test of embaucher method, of class Entreprise.
     */
    @Test
    public void testEmbaucher() {
        System.out.println("embaucher");
        Employe emp = null;
        Entreprise instance = null;
        instance.embaucher(emp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of debaucher method, of class Entreprise.
     */
    @Test
    public void testDebaucher() {
        System.out.println("debaucher");
        Employe emp = null;
        Entreprise instance = null;
        instance.debaucher(emp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomEntreprise method, of class Entreprise.
     */
    @Test
    public void testGetNomEntreprise() {
        System.out.println("getNomEntreprise");
        Entreprise instance = null;
        String expResult = "";
        String result = instance.getNomEntreprise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomEntreprise method, of class Entreprise.
     */
    @Test
    public void testSetNomEntreprise() {
        System.out.println("setNomEntreprise");
        String nomEntreprise = "";
        Entreprise instance = null;
        instance.setNomEntreprise(nomEntreprise);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbEmploye method, of class Entreprise.
     */
    @Test
    public void testGetNbEmploye() {
        System.out.println("getNbEmploye");
        Entreprise instance = null;
        int expResult = 0;
        int result = instance.getNbEmploye();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbEmploye method, of class Entreprise.
     */
    @Test
    public void testSetNbEmploye() {
        System.out.println("setNbEmploye");
        int nbEmploye = 0;
        Entreprise instance = null;
        instance.setNbEmploye(nbEmploye);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Entreprise.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Entreprise instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherEntreprise method, of class Entreprise.
     */
    @Test
    public void testAfficherEntreprise() {
        System.out.println("afficherEntreprise");
        Entreprise instance = null;
        instance.afficherEntreprise();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
