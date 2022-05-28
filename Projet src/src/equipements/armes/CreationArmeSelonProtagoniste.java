package equipements.armes;

import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;

public class CreationArmeSelonProtagoniste {
	
	
	public void creationArmeHumain(int choixArme, Humain proprietaire) {
		switch(choixArme) {
			case 1 : 
				Epee epee = new Epee();
				epee.proprietaire = proprietaire;
				epee.addAttaque();
				break;
			case 2 :
				Hache hache = new Hache();
				hache.proprietaire = proprietaire;
				hache.addAttaque();
				break;
			case 3 :
				Arc arc = new Arc(5);
				arc.proprietaire = proprietaire;
				arc.addAttaque();
				break;
		}
	}	
	
	public void creationArmeGobelin(int choixArme, Gobelin proprietaire) {
		switch(choixArme) {
		case 1 : 
			Sarbacane sarbacane = new Sarbacane(8);
			sarbacane.proprietaire = proprietaire;
			sarbacane.addAttaque();
			break;
		case 2 :
			Lance lance = new Lance();
			lance.proprietaire = proprietaire;
			lance.addAttaque();
			break;
		}
	}

}
