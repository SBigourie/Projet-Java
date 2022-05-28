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
	
	public void useSpell() {
		this.proprietaire.setDegat(proprietaire.getDegat()+this.nbPointAttaque);
		System.out.println("Attaque :"+ proprietaire.getDegat() + "et  attaque du spell"+ this.nbPointAttaque);
		this.proprietaire.setVie(proprietaire.getVie()+this.nbPointVie);
	}
	
	
	
}
