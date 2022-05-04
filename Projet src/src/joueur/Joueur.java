package joueur;

import affrontement.Camps;

public class Joueur {
	
	private String nomJoueur;
	private Camps camps;
	
	public Joueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	//Récupére ne nom du joueur
	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public Camps getCamps() {
		return camps;
	}

	public void setCamps(Camps camps) {
		this.camps = camps;
	}
	

}
