package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.humain.Humain;

public class Epee extends Arme{
	
    protected Humain proprietaire;

    public Epee() {
        super("Epee", 25);
    }
    
    //ajout des degats de l'arc au propriétaire
    public void addAttaque() {
      	this.proprietaire.setDegat(this.degat);
      }
}
