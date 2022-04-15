package equipements.spell;

public class Vie extends Spell{

	private int nbPointVie;
	
	public Vie(String nature) {
		super("Spell vie");
		this.nbPointVie = 10;
	}
	
	public String useSpell() {
		
		this.proprietaire.setVie(this.proprietaire.getVie() + this.nbPointVie);
		
		return this.proprietaire.getNom() + " utilise un " + this.getNature() + ". \n"
		+ "Cela lui ajoute 10 points de vie. \n";
	}

}
