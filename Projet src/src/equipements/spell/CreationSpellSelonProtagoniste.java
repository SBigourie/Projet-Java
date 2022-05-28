package equipements.spell;

import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;
import protagonistes.mage.Mage;

public class CreationSpellSelonProtagoniste {
	
	//creation du spell selon le choix passé en param et avec comme proprio un Mage
	public void creationSpell(int choixSpell, Mage proprietaire) {
		switch(choixSpell) {
			case 1 :
				//creation du spell
				Attaque spellAttaque = new Attaque();
				//initilisation du proprio sur le spell
				spellAttaque.proprietaire = proprietaire;
				//ajout des caratéristiques du spell sur le proprio
				spellAttaque.useSpell();
				break;
			case 2 :
				Polyvalent polyvalent = new Polyvalent();
				polyvalent.proprietaire = proprietaire;
				polyvalent.useSpell();
				break;
			case 3 :
				Vie vie = new Vie();
				vie.proprietaire = proprietaire;
				vie.useSpell();
				break;
		}
	}	

}
