package joueur;

import affrontement.Camps;

public class Joueur {
	
	private String nom;
	private Camps camps;
	
	public Joueur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Camps getCamps() {
		return camps;
	}

	public void setCamps(Camps camps) {
		this.camps = camps;
	}
	

}
