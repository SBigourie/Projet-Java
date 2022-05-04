package equipements.armes;

import protagonistes.EtreVivant;
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

    protected String attaque(EtreVivant etreVivant) {
        return proprietaire.getNom() + " attaque " + etreVivant.getNom() + " avec son " + getNature() + "\n"
                +etreVivant.subirAttaque(etreVivant,degat);
    }
}
