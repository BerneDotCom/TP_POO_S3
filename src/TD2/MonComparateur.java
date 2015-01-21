/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.util.Comparator;

/**
 *
 * @author Val
 */
public class MonComparateur implements Comparator<Conteneur>{
    final private GestionDistances gestionDistance = new GestionDistances();

        @Override
        public int compare(Conteneur o1, Conteneur o2) {
            int c = gestionDistance.getDistances(o2.getDestination()) - gestionDistance.getDistances(o1.getDestination());

            if (c != 0) {
                return c;
            }

            return o2.getPoids() - o1.getPoids();
        }
}
