package protagonistes;

import java.io.Serializable;

import affrontement.Bataille;

public class EtreVivant implements Serializable{

    protected String nom;
    protected int vie;
    protected int degat;
    protected int joueur;

    public int getJoueur() {
        return joueur;
    }

    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }

    protected Bataille bataille;
    protected Bataille eliminer;

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }


    public EtreVivant(String nom, int vie, int degat) {
        this.nom = nom;
        this.vie = vie;
        this.degat = degat;
    }

    public String toString() {
        String res = "" + this.nom + "/ PV:" + this.vie + "/ Attaque:" +this.degat + "    "+this.joueur;
        return res;
    }

    public boolean protagoniteChemin(int xOrig, int yOrig, int xDest, int yDest, EtreVivant[][] plateau) {
        return false;
    }

    public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
        boolean valid = false;
        int x = xDest - xOrig;
        if (x < 0) {
            x = -x;
        }
        int y = yDest - yOrig;
        if (y < 0) {
            y = -y;
        }
        if (x <= 0 && x >= 1 && y >= 0 && y <= 1) {
            valid = true;
        }
        return valid;
    }

    public Bataille getBataille() {
        return bataille;
    }

    public void setBataille(Bataille bataille) {
        this.bataille = bataille;
    }

    public Bataille getEliminer() {
        return eliminer;
    }

    public void setEliminer(Bataille eliminer) {
        this.eliminer = eliminer;
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public String rejointBataille(Bataille bataille) {
        this.bataille = bataille;
        return "";
    }
    public String mourir() {
        return null;
    }
    public String subirAttaque(EtreVivant etreVivant, int forceAttaque){
        this.vie = (this.vie - forceAttaque);
        if (this.vie > 0)
        {
            return (nom+" subit une violente attaque, mais il parvient ? se relever \n");
        }
        else
        {
            return (nom+" subit une violente attaque, trop violente pour survivre \n") + etreVivant.mourir();

        }
    }
}
