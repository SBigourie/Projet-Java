package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.gobelin.Gobelin;

public class Lance extends Arme{
    protected Gobelin proprietaire;

    public Lance() {
        super("Lance", 25);
    }
    
  protected String attaque(EtreVivant etreVivant) {
    	
    	return proprietaire.getNom() + " attaque " + etreVivant.getNom() + " avec son " + getNature() + "\n"
    +etreVivant.subirAttaque(etreVivant,degat);
    
    }
  
  public void addAttaque() {
	  	this.proprietaire.setDegat(this.degat);
	  }
}
