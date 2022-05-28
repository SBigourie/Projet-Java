package equipements.armes;

import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;

public class CreationArmeSelonProtagoniste {
	
	//creation de l'arme selon le choix passé en parametre et le propriétaire de type humain
	public void creationArmeHumain(int choixArme, Humain proprietaire) {
		switch(choixArme) {
			case 1 : 
				//creation de l'arme
				Epee epee = new Epee();
				//initialisation du propriétaire de l'arme
				epee.proprietaire = proprietaire;
				//ajout des caractéristiques de l'arme sur le protagoniste
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
	
	//creation de l'arme selon le choix passé en parametre et le propriétaire de type gobelin
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
