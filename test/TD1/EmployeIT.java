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
public class EmployeIT {
    
    public EmployeIT() {
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
     * Test of afficherEmploye method, of class Employe.
     */
    @Test
    public void testAfficherEmploye() {
        System.out.println("afficherEmploye");
        Employe instance = null;
        instance.afficherEmploye();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Employe.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Employe instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Employe.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Employe instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Employe.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Employe instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Employe.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Employe instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Employe.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Employe instance = null;
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Employe.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Employe instance = null;
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEchelon method, of class Employe.
     */
    @Test
    public void testGetEchelon() {
        System.out.println("getEchelon");
        Employe instance = null;
        int expResult = 0;
        int result = instance.getEchelon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEchelon method, of class Employe.
     */
    @Test
    public void testSetEchelon() {
        System.out.println("setEchelon");
        int echelon = 0;
        Employe instance = null;
        instance.setEchelon(echelon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateNaiss method, of class Employe.
     */
    @Test
    public void testGetDateNaiss() {
        System.out.println("getDateNaiss");
        Employe instance = null;
        String expResult = "";
        String result = instance.getDateNaiss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateNaiss method, of class Employe.
     */
    @Test
    public void testSetDateNaiss() {
        System.out.println("setDateNaiss");
        String dateNaiss = "";
        Employe instance = null;
        instance.setDateNaiss(dateNaiss);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateEmb method, of class Employe.
     */
    @Test
    public void testGetDateEmb() {
        System.out.println("getDateEmb");
        Employe instance = null;
        String expResult = "";
        String result = instance.getDateEmb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateEmb method, of class Employe.
     */
    @Test
    public void testSetDateEmb() {
        System.out.println("setDateEmb");
        String dateEmb = "";
        Employe instance = null;
        instance.setDateEmb(dateEmb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class Employe.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Employe.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Employe instance = null;
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbHeures method, of class Employe.
     */
    @Test
    public void testGetNbHeures() {
        System.out.println("getNbHeures");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.getNbHeures();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbHeures method, of class Employe.
     */
    @Test
    public void testSetNbHeures() {
        System.out.println("setNbHeures");
        double nbHeures = 0.0;
        Employe instance = null;
        instance.setNbHeures(nbHeures);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalaireBrut method, of class Employe.
     */
    @Test
    public void testGetSalaireBrut() {
        System.out.println("getSalaireBrut");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.getSalaireBrut();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Employe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employe instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalaireBrut method, of class Employe.
     */
    @Test
    public void testSetSalaireBrut() {
        System.out.println("setSalaireBrut");
        double SalaireBrut = 0.0;
        Employe instance = null;
        instance.setSalaireBrut(SalaireBrut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalaireNet method, of class Employe.
     */
    @Test
    public void testGetSalaireNet() {
        System.out.println("getSalaireNet");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.getSalaireNet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalaireNet method, of class Employe.
     */
    @Test
    public void testSetSalaireNet() {
        System.out.println("setSalaireNet");
        double SalaireNet = 0.0;
        Employe instance = null;
        instance.setSalaireNet(SalaireNet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerSalaireBrut method, of class Employe.
     */
    @Test
    public void testCalculerSalaireBrut() {
        System.out.println("calculerSalaireBrut");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaireBrut();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerSalaireNet method, of class Employe.
     */
    @Test
    public void testCalculerSalaireNet() {
        System.out.println("calculerSalaireNet");
        double Nbase = 0.0;
        double NnbHeures = 0.0;
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaireNet(Nbase, NnbHeures);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
