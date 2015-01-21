/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Val
 */
public class GestionDistances {
    private static final Map<String,Integer> distances = new HashMap<>();
    
    public GestionDistances(){
        distances.put("Barcelone",183);
        distances.put("Valence",337);
        distances.put("Alicante",399);
        distances.put("Malaga",599);
    }
    
    public static Integer getDistances(String ville){
        return distances.get(ville);
    }
}
