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
public class Technicien extends Employe{
    
    private double nb_unites;
    private double taux_commission;
    
    public Technicien(int Nnumero, String Nnom) {
        super(Nnumero, Nnom);
    }
    
    public double calculerSalaireBrut(){
        return getBase() * getNbHeures() + nb_unites * taux_commission;
    }

    public double getNb_unites() {
        return nb_unites;
    }

    public void setNb_unites(double nb_unites) {
        this.nb_unites = nb_unites;
    }

    public double getTaux_commission() {
        return taux_commission;
    }

    public void setTaux_commission(double taux_commission) {
        this.taux_commission = taux_commission;
    }
    
}
