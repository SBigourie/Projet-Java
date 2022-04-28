package equipements.spell;

public class Attaque extends Spell{
	
	private int nbPointAttaque;

	public Attaque(String nature) {
		super("Spell attaque");
		this.nbPointAttaque = 10;
	}
	
	public String useSpell() {
		this.proprietaire.setNbPointsAttaque(this.proprietaire.getNbPointsAttaque() + this.nbPointAttaque);
		
		return this.proprietaire.getNom() + " utilise un " + this.getNature() + ". \n"
		+ "Cela lui ajoute 10 points d'attaque. \n";
	}
	

}
