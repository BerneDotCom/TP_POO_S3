/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Val
 */
public class Chargement {
    final private Queue<Conteneur> lesConteneurs= new LinkedList<>();
    
    public void embarquer(Conteneur conteneur){
        lesConteneurs.add(conteneur);
        System.out.println("Ajout du conteneur : " + conteneur);
    }
    public void debarquer(){
        Conteneur conteneur = lesConteneurs.poll();
        if(conteneur != null){
            System.out.println("Debarquement du conteneur : " + conteneur);
        }
    }
}
