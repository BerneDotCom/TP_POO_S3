/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Val
 */
public class FabriqueConnectable implements IFabriqueConnectable{

    @Override
    public Connectable creer(String objetACreer) {
        try {
            return (Connectable) Class.forName(objetACreer).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(FabriqueConnectable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
