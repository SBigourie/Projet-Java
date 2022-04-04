package armes;

import protagonistes.Dragon;
import protagonistes.Homme;

public class Arme {
    protected Homme proprietaire;
    protected String nature;
    protected int degat;

    public Arme (String nature, int degat) {
        this.nature = nature;
        this.degat = degat;
    }

    public Homme getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Homme proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getNature() {
        return nature;
    }

    public boolean estPris () {
        return proprietaire != null;
    }

    public void prendre (Homme proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void lacher () {
        this.proprietaire = null;
    }
    public String attaque (Dragon dragon) {
        return proprietaire.getNom() + " attaque " + dragon.getNom() + " avec son " + getNature() + "\n"
                +dragon.subirAttaque(dragon,degat);
    }
}
