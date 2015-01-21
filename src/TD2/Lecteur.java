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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Val
 */
public class Lecteur {
    final  private  List<Conteneur> listeConteneurs = new ArrayList<>();
    final private Comparator<Conteneur> comparateur = new MonComparateur();
    
    public List<Conteneur> lire(String fichier) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fichier);
        ObjectInputStream ois = new ObjectInputStream(fis);
        for(int i = 0; i < listeConteneurs.size(); ++i){
                Conteneur conteneur = (Conteneur) ois.readObject();
                listeConteneurs.add(conteneur);
        }
        Collections.sort(listeConteneurs, comparateur);
        return listeConteneurs;
    }
}
