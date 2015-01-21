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
public class EmployeOrdinaire extends Employe{

    public EmployeOrdinaire(int Nnumero, String Nnom) {
        super(Nnumero, Nnom);
    }
    
    public double calculerSalaireBrut(){
        return getBase() * getNbHeures() + getEchelon() *100;
    }
}
