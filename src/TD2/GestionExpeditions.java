/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.io.IOException;

/**
 *
 * @author Val
 */
public class GestionExpeditions {
    public GestionExpeditions() throws IOException, ClassNotFoundException{
        CreationConteneurs.creer();
        CreationConteneurs.creer2();
        Lecteur lecteur = new Lecteur();
        
        for (Conteneur conteneur : lecteur.lire("../Conteneurs.ser")){
            System.out.println(conteneur);
        }
        
                
        for (Conteneur conteneur : lecteur.lire("../Conteneurs2.ser")){
            System.out.println(conteneur);
        }
    }
    
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        GestionExpeditions expeditions = new GestionExpeditions();
    }
}
