package equipements.armes;

import protagonistes.EtreVivant;
import protagonistes.humain.Humain;
import protagonistes.monstre.Monstre;

public class Arme {
    protected String nature;
    protected int degat;

    public Arme (String nature, int degat) {
        this.nature = nature;
        this.degat = degat;
    }

    public String getNature() {
        return nature;
    }

  protected String attaque(EtreVivant etreVivant) {
	  return null;
    }
}
