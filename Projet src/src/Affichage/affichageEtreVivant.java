package Affichage;

import java.util.ArrayList;
import java.util.List;

public class affichageEtreVivant {

	public void affichage() {
		List<String> tabProtagonistes = new ArrayList<String>();
		tabProtagonistes.add("1) Gobelin");
		tabProtagonistes.add("2) Humain");
		tabProtagonistes.add("3) Mage");
		tabProtagonistes.add("4) Monstre");
		
		for(String protagoniste :tabProtagonistes) {
			System.out.println(protagoniste);
		}
		
	}
}
