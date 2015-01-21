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
public class Commerciaux_Vendeur extends Employe{
    private double chiffre_affaire;
    private double taux_commission;
    public Commerciaux_Vendeur(int Nnumero, String Nnom) {
        super(Nnumero, Nnom);
    }

    public double calculerSalaireBrut(){
        return getBase() + chiffre_affaire * taux_commission;
    }
    
    public double getChiffre_affaire() {
        return chiffre_affaire;
    }

    public void setChiffre_affaire(double chiffre_affaire) {
        this.chiffre_affaire = chiffre_affaire;
    }

    public double getTaux_commission() {
        return taux_commission;
    }

    public void setTaux_commission(double taux_commission) {
        this.taux_commission = taux_commission;
    }
    
    
}
