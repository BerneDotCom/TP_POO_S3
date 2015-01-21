/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Val
 */
public class CreationConteneurs {
	
	public static void creer() {
		Conteneur c1=new Conteneur("Soc1",110,"Alicante");
		Conteneur c2=new Conteneur("Soc3",110,"Barcelone");
		Conteneur c3=new Conteneur("Soc2",90,"Valence");
		ObjectOutputStream oos = null;
		try {
		  FileOutputStream fichier = new FileOutputStream("../Conteneurs.ser");
		  oos = new ObjectOutputStream(fichier);
		  oos.writeObject(c1);
		  System.out.println("Sauvegarde de "+c1);
		  oos.writeObject(c2);
		  System.out.println("Sauvegarde de "+c2);
		  oos.writeObject(c3);
		  System.out.println("Sauvegarde de "+c3);
		} catch (java.io.IOException e) {
		} finally {
		  try {
		    if (oos != null) {
		      oos.flush();
		      oos.close();
		    }
		  } catch (IOException ex) {
		  }
		}
	}	
	
	public static void creer2() {
		Conteneur c1=new Conteneur("Soc1",110,"Alicante");
		Conteneur c2=new Conteneur("Soc3",110,"Barcelone");
		Conteneur c3=new Conteneur("Soc2",90,"Valence");
		Conteneur c4=new Conteneur("Soc2",120,"Valence");
		ObjectOutputStream oos = null;
		try {
		  FileOutputStream fichier = new FileOutputStream("../Conteneurs2.ser");
		  oos = new ObjectOutputStream(fichier);
		  oos.writeObject(c1);
		  System.out.println("Sauvegarde de "+c1);
		  oos.writeObject(c2);
		  System.out.println("Sauvegarde de "+c2);
		  oos.writeObject(c3);
		  System.out.println("Sauvegarde de "+c3);
		  oos.writeObject(c4);
		  System.out.println("Sauvegarde de "+c4);		} catch (java.io.IOException e) {
		} finally {
		  try {
		    if (oos != null) {
		      oos.flush();
		      oos.close();
		    }
		  } catch (IOException ex) {
		  }
		}
	}	
}