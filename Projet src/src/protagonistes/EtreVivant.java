package protagonistes;

import java.io.Serializable;
import java.util.Random;

import SetUP.champDeBataille;
import affrontement.Bataille;

public class EtreVivant implements Serializable{

    protected String nom;
    protected int vie;
    protected int degat;
    protected int joueur;
    protected Bataille bataille;
    protected Bataille eliminer;
    


    public EtreVivant(String nom, int vie, int degat) {
        this.nom = nom;
        this.vie = vie;
        this.degat = degat;
    }

	public int getJoueur() {
        return joueur;
    }

    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }


    //affichage des caractéristiques d'un etrevivant
    public String toString() {
        String res = "" + this.nom + "/ PV:" + this.vie + "/ Attaque:" +this.degat + "/ J:"+ this.joueur;
        return res;
    }
    
    //savoir si un protagoniste combat ou pas
    public boolean protagoniteCombat(int xOrig, int yOrig, int xDest, int yDest, EtreVivant[][] plateau) {
        boolean combat = false;
        return combat;
    }

    //savoir si le déplacement entrer par l'utilisateur est valide
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
    
    //faie rejoindre la bataille à l'etre vivant
    public String rejointBataille(Bataille bataille) {
        this.bataille = bataille;
        return "";
    }
    
    public String mourir() {
        return null;
    }
    
    //faire subir une attaque à entre deux protagonsite 
    public String subirAttaque(int forceAttaque){
        this.vie = (this.vie - forceAttaque);
        if (this.vie > 0)
        {

            return (nom+" subit une violente attaque, mais il parvient ? se relever \n");
        }
        else
        {
            return (nom+" est mort \n") + this.mourir();
        }
    }
    
    //permet de gagner aléatoirement des point de vie à chaque foix qu'un etrevivant tue un autre etre
    public String regenerer(){
        Random random = new Random();
        int pvSupplementaire;
        pvSupplementaire= random.nextInt(70);
        this.vie = this.vie + pvSupplementaire;
        return (nom+"gagne" +pvSupplementaire);
    }
}
