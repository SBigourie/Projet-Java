package equipements.armures;

import equipements.armes.Arc;
import equipements.armes.Epee;
import equipements.armes.Hache;
import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;

public class CreationArmureSelonProtagoniste {
	
	//creation de l'armure selon le choix passé en param et le proprio de type humain
	public void creationArmureHumain(int choixArmure, Humain humain) {
		switch(choixArmure) {
		case 1 : 
			//creation de l'armure
			Casque casque = new Casque();
			//initialisation du proprio de l'armure
			casque.proprietaireHumain = humain;
			//ajout des caractéristiques de l'armure au proprio
			casque.addVieHumain();
			break;
		case 2 :
			Bouclier bouclier = new Bouclier();
			bouclier.proprietaireHumain = humain;
			bouclier.addVieHumain();
			break;
		case 3 :
			Jambiere jambiere = new Jambiere();
			jambiere.proprietaireHumain = humain;
			jambiere.addVieHumain();
			break;
		case 4 :
			Cotte_de_mailles cotte_de_maille = new Cotte_de_mailles();
			cotte_de_maille.proprietaireHumain = humain;
			cotte_de_maille.addVieHumain();
			break;
		}
	}
	
	//creation de l'armure selon le choix passé en param et le proprio de type humain
	public void creationArmureGobelin(int choixArmure, Gobelin gobelin) {
		switch(choixArmure) {
		case 1 : 
			//creation de l'armure
			Casque casque = new Casque();
			//initialisation du proprio de l'armure
			casque.proprietaireGobelin = gobelin;
			//ajout des caractéristiques de l'armure au proprio
			casque.addVieGobelin();
			break;
		case 2 :
			Bouclier bouclier = new Bouclier();
			bouclier.proprietaireGobelin = gobelin;
			bouclier.addVieGobelin();
			break;
		case 3 :
			Jambiere jambiere = new Jambiere();
			jambiere.proprietaireGobelin = gobelin;
			jambiere.addVieGobelin();
			break;
		case 4 :
			Cotte_de_mailles cotte_de_maille = new Cotte_de_mailles();
			cotte_de_maille.proprietaireGobelin = gobelin;
			cotte_de_maille.addVieGobelin();
			break;
		}
	}

}
