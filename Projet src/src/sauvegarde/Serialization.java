package sauvegarde;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{

	public void saveGame(Object object) {
		try {
			FileOutputStream fos = new FileOutputStream("backup"+object+".sav");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
			oos.flush();
			oos.close();
			System.out.println("Jeu sauvegarder \n");
		}catch (Exception e) {
			System.out.println("Erreur : problème lors de la sauvegarde \n");
		}
	}
	
	public void loadGame(Object object) {
		try {
			FileInputStream fis = new FileInputStream("backup"+object+".sav");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object = (Object) ois.readObject();
			ois.close();
			System.out.println("Jeu charger \n");
		}catch (Exception e) {
			System.out.println("Erreur : problème lors du chargement du jeu \n");
		}
	}
}
