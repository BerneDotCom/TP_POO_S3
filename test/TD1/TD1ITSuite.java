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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Val
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TD1.Commerciaux_RepresentantIT.class, TD1.EmployeOrdinaireIT.class, TD1.TechnicienIT.class, TD1.EntrepriseIT.class, TD1.EmployeIT.class, TD1.Commerciaux_VendeurIT.class, TD1.GestionEntreprisesIT.class})
public class TD1ITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
