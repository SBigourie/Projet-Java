package equipements.armures;

import protagonistes.humain.Humain;

public class Armure {
	
	private Humain proprietaire;
    private String nature;
    private int nbVieAjouter;
    
    public Armure(String nature, int nbVieAjouter) {
    	this.nature = nature;
    	this.nbVieAjouter = nbVieAjouter;
    }

	public Humain getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Humain proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public int getNbVieAjouter() {
		return nbVieAjouter;
	}

	public void setNbVieAjouter(int nbVieAjouter) {
		this.nbVieAjouter = nbVieAjouter;
	}
    
}
