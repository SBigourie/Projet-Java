package protagonistes.humain;

import affrontement.Bataille;
import equipements.armes.Arme;
import equipements.armures.Armure;
import protagonistes.EtreVivant;

public class Humain extends EtreVivant {

    protected Armure armure;

    public Humain(String nom) {
        super(nom, 100,0);
    }

    public String rejointBataille(Bataille bataille) {
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String mourir() {
        return "c’est ainsi que:" + nom + " mourut\n" +
                bataille.eliminer(this) ;

    }
}
