package equipements.spell;

import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;
import protagonistes.mage.Mage;

public class CreationSpellSelonProtagoniste {
	
	
	public void creationSpell(int choixSpell, Mage proprietaire) {
		switch(choixSpell) {
			case 1 : 
				Attaque spellAttaque = new Attaque();
				spellAttaque.proprietaire = proprietaire;
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
