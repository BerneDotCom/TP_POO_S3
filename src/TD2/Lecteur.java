/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Val
 */
public class Lecteur {
    List<Conteneur> listeConteneurs = new ArrayList<>();
    public List<Conteneur> lire(String fichier) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fichier);
        ObjectInputStream ois = new ObjectInputStream(fis);
        for(int i = 0; i < listeConteneurs.size(); ++i){
         {
                Conteneur conteneur = (Conteneur) ois.readObject();
                listeConteneurs.add(conteneur);
            }
        }
        return listeConteneurs;
    }
}
