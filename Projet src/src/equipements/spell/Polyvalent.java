package equipements.spell;

public class Polyvalent extends Spell{
	
	private int nbPointAttaque;
	private int nbPointVie;

	public Polyvalent(String nature) {
		super("Spell vie plus attaque");
		this.nbPointAttaque = 5;
		this.nbPointVie = 5;
	}
	
	public String useSpell() {
		this.proprietaire.setNbPointsAttaque(this.proprietaire.getNbPointsAttaque() + this.nbPointAttaque);
		this.proprietaire.setVie(this.proprietaire.getVie() + this.nbPointVie);
		return this.proprietaire.getNom() + " utilise un " + this.getNature() + ". \n"
		+ "Cela lui ajoute 5 points d'attaque et de vie. \n";
	}

}
