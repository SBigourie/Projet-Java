package equipements.spell;

import protagonistes.mage.Mage;

public class Spell {
	
	protected Mage proprietaire;
	protected String nature;
	protected int nbPointAttaque;
	protected int nbPointVie;
	
	public Spell(String nature,int nbPointAttaque, int nbPointVie) {
		this.nature = nature;
		this.nbPointAttaque = nbPointAttaque;
		this.nbPointVie = nbPointVie;
	}
	
	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	//ajout des caratéristiques du spell sur le proprio de type Mage
	public void useSpell() {
		//ajout des points d'attaques 
		this.proprietaire.setDegat(proprietaire.getDegat()+this.nbPointAttaque);
		//ajout des points de vie 
		this.proprietaire.setVie(proprietaire.getVie()+this.nbPointVie);
	}
	
	
	
}
