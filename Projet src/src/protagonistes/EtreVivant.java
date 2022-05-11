package protagonistes;

import affrontement.Bataille;
import joueur.Joueur;

public class EtreVivant {
    protected String nom;
    protected int vie;
    protected Bataille bataille;
    protected Bataille eliminer;

    public EtreVivant(String nom, int vie) {
        this.vie=vie;
        this.nom=nom;
    }

    public String joueur(Joueur joueur1){
        return joueur1.getNomJoueur();
    }

    public String getNom() {
        return nom;
    }

    public String rejointBataille(Bataille bataille) {
        this.bataille = bataille;
        return "";
    }

    public String mourir() {
        return null;
    }

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	public int getVie() {
		return vie;
	}

	public String subirAttaque(EtreVivant etreVivant, int forceAttaque){
        this.vie = (this.vie - forceAttaque);
        if (this.vie > 0)
        {
            return (nom+" subit une violente attaque, mais il parvient à se relever \n");
        }
        else
        {
            return (nom+" subit une violente attaque, trop violente pour survivre \n") + etreVivant.mourir();

        }
    }

    public boolean isValid (int xOrig, int yOrig, int xDest, int yDest){
        boolean valid = false;
        int x = xDest - xOrig;
        int y = yDest - yOrig;
        if (x<0){
            x = -x;
        }
        if (y<0){
            y = -y;
        }
        if (x<= 0 && x<= 1 && y>=0 && y<=1){
            valid = true;
        }
        return valid;
    }


}
