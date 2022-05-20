package stockage;

import protagonistes.TypeEtreVivant;

public class stockProtagonisteChoisie {
	
	//mettre le tableau de gobelin, humain, ... ici
	// Après avoir 
	
	public void select(int choixProtagoniste,TypeEtreVivant typeEtre) {
		switch (typeEtre){
		case GOBELIN:
			switch(choixProtagoniste) {
				case 1:
					//stockage dans un tableau le gobelin rouge
				case 2:
					
				case 3:
					
			}
			break;
		case HUMAIN:
			switch(choixProtagoniste) {
				case 1:
					
				case 2:
					
				case 3:
			}
			break;
		case MAGE:
			switch(choixProtagoniste) {
				case 1:
					
				case 2:
					
				case 3:
			}
			break;
		case MONSTRE:
			switch(choixProtagoniste) {
				case 1:
					
				case 2:
					
				case 3:
			}
			break;
		}
	}

}
