package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.gobelin.Gobelin;

public class Lance extends Arme{
    protected Gobelin proprietaire;

    public Lance() {
        super("Lance", 15);
    }
      
  //ajout des caractéristiques de l'arme au proprio
  public void addAttaque() {
	  	this.proprietaire.setDegat(this.degat);
	  }
}
