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
public class Employe {
    private int numero;
    private String nom;
    private String prenom;
    private int echelon;
    private String dateNaiss;
    private String dateEmb;
    private double base;
    private double nbHeures;
    private double SalaireBrut;
    private double SalaireNet;
    
    
   public Employe(int Nnumero,String Nnom){
       numero = Nnumero;
       nom = Nnom;
   }

   public void afficherEmploye(){
       System.out.println("Numero : "+  getNumero()+ " Nom : " + getNom() );
   }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(String dateEmb) {
        this.dateEmb = dateEmb;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
    }

    public double getSalaireBrut() {
        return SalaireBrut;
    }

    @Override
    public String toString() {
        return "Employe{" + "numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", echelon=" + echelon + ", dateNaiss=" + dateNaiss + ", dateEmb=" + dateEmb + ", base=" + base + ", nbHeures=" + nbHeures + ", SalaireBrut=" + SalaireBrut + ", SalaireNet=" + SalaireNet + '}';
    }

    public void setSalaireBrut(double SalaireBrut) {
        this.SalaireBrut = SalaireBrut;
    }

    public double getSalaireNet() {
        return SalaireNet;
    }

    public void setSalaireNet(double SalaireNet) {
        this.SalaireNet = SalaireNet;
    }
   
   public double calculerSalaireBrut(){
       return SalaireBrut = getBase() * getNbHeures();
   }
   
   public double calculerSalaireNet(double Nbase, double NnbHeures){
       return SalaireNet = calculerSalaireBrut()* 0.8;
   }
}
