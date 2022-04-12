package armes;

import protagonistes.monstre.Dragon;
import protagonistes.humain.Humain;

public class Arme {
    protected Humain proprietaire;
    protected String nature;
    protected int degat;

    public Arme (String nature, int degat) {
        this.nature = nature;
        this.degat = degat;
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

    public boolean estPris () {
        return(proprietaire != null);
    }

    public void lacher () {
        this.proprietaire = null;
    }
    public String attaque (Dragon dragon) {
        return proprietaire.getNom() + " attaque " + dragon.getNom() + " avec son " + getNature() + "\n"
                +dragon.subirAttaque(dragon,degat);
    }
}
