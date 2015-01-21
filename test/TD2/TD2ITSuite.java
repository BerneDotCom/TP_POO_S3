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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Val
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TD2.TarifIT.class, TD2.CreationConteneursIT.class, TD2.ConteneurIT.class, TD2.MonComparateurIT.class, TD2.ChargementIT.class, TD2.LecteurIT.class, TD2.GestionClientsIT.class, TD2.GestionDistancesIT.class, TD2.GestionExpeditionsIT.class, TD2.TarifFactoryIT.class})
public class TD2ITSuite {

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
