/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Val
 */
public class Entreprise {
    private String nomEntreprise;
    private int nbEmploye;
    final private Collection<Employe> employes = new ArrayList<Employe>();
    
    public Entreprise(String nom, int nb){
        nomEntreprise = nom;
        nbEmploye =   nb;
    }
    
    public void embaucher(Employe emp){
        for( ; employes.size() < nbEmploye;){
            employes.add(emp);
        }
    }
    
    public void debaucher(Employe emp){
        employes.remove(emp);
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    @Override
    public String toString() {
        return "Entreprise{" + "nomEntreprise=" + nomEntreprise + ", nbEmploye=" + nbEmploye + '}';
    }
    
    public void afficherEntreprise(){
        System.out.println("Nom : " + getNomEntreprise() + " Nb d'employe : " + getNbEmploye());
    }
}
