package protagonistes;

import affrontement.Bataille;

public class EtreVivant {
    protected String nom;
    protected int vie;
    protected Bataille bataille;
    protected Bataille eliminer;

    public EtreVivant(String nom, int vie) {
        this.vie=vie;
        this.nom=nom;
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
}
