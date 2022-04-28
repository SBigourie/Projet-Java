package equipements.armures;

import protagonistes.EtreVivant;
import protagonistes.humain.Humain;

public class Armure {
	
	protected Humain proprietaire;
	protected String nature;
	protected int nbVieAjouter;
    
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
	
	public String prendreCout(EtreVivant etrevivant) {
		String str = this.getProprietaire() + " dispose d'un " + this.getNature() + 
				" lui permettant d'encaisser les coûts venant de " + etrevivant.getNom();
		
		this.getProprietaire().setVie(this.getProprietaire().getVie() + this.getNbVieAjouter());
		
		if(this.getProprietaire().getVie() >= 0 ) {
			return str + " mais cela n'a pas suffit pour le faire survivre.";
		}else {
			return str;
		}
		
	}
    
}
