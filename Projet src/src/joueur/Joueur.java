package joueur;

import affrontement.Camps;

public class Joueur {
	
	private String nomJoueur;
	private int numJoueur;
	private Camps camps;



	public Joueur(String nomJoueur, int numJoueur) {
		this.numJoueur = numJoueur;
		this.nomJoueur = nomJoueur;
	}

	//Récupére ne nom du joueur
	public String getNomJoueur() {
		return nomJoueur;
	}
	
	public int getNumJoueur() {
		return numJoueur;
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
