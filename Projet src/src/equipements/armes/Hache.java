package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.humain.Humain;

public class Hache extends Arme{
    protected Humain proprietaire;

    public Hache() {
        super("Hache", 20);
    }
    
  protected String attaque(EtreVivant etreVivant) {
    	
    	return proprietaire.getNom() + " attaque " + etreVivant.getNom() + " avec son " + getNature() + "\n"
    +etreVivant.subirAttaque(etreVivant,degat);
    
    }
  
  public void addAttaque() {
	  	this.proprietaire.setDegat(this.degat);
	  }
}
