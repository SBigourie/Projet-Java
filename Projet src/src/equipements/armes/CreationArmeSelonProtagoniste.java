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
			case 2 :
				Hache hache = new Hache();
				hache.proprietaire = proprietaire;
				hache.addAttaque();
			case 3 :
				Arc arc = new Arc(5);
				arc.proprietaire = proprietaire;
				arc.addAttaque();
		}
	}	
	
	public void creationArmeGobelin(int choixArme, Gobelin proprietaire) {
		
	}

}
