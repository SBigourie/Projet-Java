package equipements.armes;

import protagonistes.humain.Humain;
import protagonistes.monstre.Monstre;

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
    public String attaque (Monstre monstre) {
        return proprietaire.getNom() + " attaque " + monstre.getNom() + " avec son " + getNature() + "\n"
                +monstre.subirAttaque(monstre,degat);
    }
}
