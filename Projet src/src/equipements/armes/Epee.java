package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.humain.Humain;

public class Epee extends Arme{
    protected Humain proprietaire;


    public Epee() {
        super("Epee", 25);
    }
    
    protected String attaque(EtreVivant etreVivant) {
    	
    	return proprietaire.getNom() + " attaque " + etreVivant.getNom() + " avec son " + getNature() + "\n"
    +etreVivant.subirAttaque(degat);
    
    }
    
    public void addAttaque() {
      	this.proprietaire.setDegat(this.degat);
      }
}
