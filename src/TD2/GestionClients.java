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
public class GestionClients {
    Map<String, TarifFactory> lesClients = new HashMap<>();
    public GestionClients(){
        lesClients.put("Client1", new Tarif(2,4,0.9));
        lesClients.put("Client2", new Tarif(4,8,1));
        lesClients.put("Client3", new Tarif(1,1.5,0.7));
    }
    
    public TarifFactory calculerTarifParClients(String client){
        return lesClients.get(client);
    }
}
