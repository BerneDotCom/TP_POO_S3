  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;

/**
 *
 * @author Val
 */
public class GestionEntreprises {

    public GestionEntreprises() {
        Entreprise monEntreprise = new Entreprise("maBoiteInfo",2);
        Employe e1 = new Employe(1, "Gilbert");
        Employe e2 = new Employe(1, "Git");
        monEntreprise.embaucher(e2);
        monEntreprise.embaucher(e1);
        monEntreprise.afficherEntreprise();
    }
    
    public static void main(String args[]){
        GestionEntreprises maGestion = new GestionEntreprises();
    }
    
}
