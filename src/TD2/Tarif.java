/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

/**
 *
 * @author Val
 */
public class Tarif implements TarifFactory{
    final private double prix_mile;
    final private double prix_kilo;
    final private double prix_remise;
    
    public Tarif(double prix_mile ,double prix_kilo ,double prix_remise){
        this.prix_mile = prix_mile;
        this.prix_kilo = prix_kilo;
        this.prix_remise = prix_remise;
    }
    @Override
    public double calculerTarif(Conteneur conteneur) {
        return GestionDistances.getDistances(conteneur.getDestination()) * prix_mile + conteneur.getPoids() * prix_kilo * prix_remise;
    }
    
}
