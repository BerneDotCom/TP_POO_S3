/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.io.Serializable;

/**
 *
 * @author Val
 */
public class Conteneur implements Serializable {

    private static final long serialVersionUID = 1L;

    private String expediteur;
    private int poids;
    private String destination;
    private Tarif monTarif;

    public Conteneur(String expediteur, int poids, String destination) {
        this.expediteur = expediteur;
        this.poids = poids;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public int getPoids() {
        return poids;
    }
    
    public double calculerTarif(){
        return monTarif.calculerTarif(this);
    }

    public void setCalculeTarif(Tarif tarif) {
        this.monTarif = tarif;
    }
    
    public String getExpediteur() {
        return expediteur;
    }

    @Override
    public String toString() {
        return "Conteneur expédié par la société " + expediteur + " à destination de " + destination + " de poids " + poids;
    }

}