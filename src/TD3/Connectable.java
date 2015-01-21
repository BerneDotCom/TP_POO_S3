/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Val
 */
public class Connectable {
    private final Collection<Connectable> lesConnectables = new ArrayList<>();    
    public Connectable(){
        System.out.println("Entrer le nom du connectable a creer : \n");
        Scanner sc = new Scanner(System.in);
        String leConnectable = sc.nextLine();
                   IFabriqueConnectable maFabrique = new FabriqueConnectable();
        for( ; ; ){
            lesConnectables.add(maFabrique.creer(leConnectable));           
        }
    }
    
    public static void main(String args[]){
        Connectable mesConnectables = new Connectable();
    }
}
