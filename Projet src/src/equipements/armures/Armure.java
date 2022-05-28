package equipements.armures;

import protagonistes.EtreVivant;
import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;

public class Armure {
	
	protected Humain proprietaireHumain;
	protected Gobelin proprietaireGobelin;
	protected String nature;
	protected int nbVieAjouter;
    
    public Armure(String nature, int nbVieAjouter) {
    	this.nature = nature;
    	this.nbVieAjouter = nbVieAjouter;
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


	public Humain getProprietaireHumain() {
		return proprietaireHumain;
	}


	public void setProprietaireHumain(Humain proprietaireHumain) {
		this.proprietaireHumain = proprietaireHumain;
	}


	public Gobelin getProprietaireGobelin() {
		return proprietaireGobelin;
	}


	public void setProprietaireGobelin(Gobelin proprietaireGobelin) {
		this.proprietaireGobelin = proprietaireGobelin;
	}
	
		
	public void addVieHumain() {
		this.proprietaireHumain.setVie(proprietaireHumain.getVie() + this.nbVieAjouter);
	}
	
	public void addVieGobelin() {
		this.proprietaireGobelin.setVie(proprietaireGobelin.getVie() + this.nbVieAjouter);
	}
    
}
