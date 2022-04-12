package protagonistes.humain;

import affrontement.Bataille;
import armes.Arme;
import protagonistes.EtreVivant;

public class Humain extends EtreVivant {

    protected Arme maPossession;

    public Humain(String nom) {
        super(nom, 100);
    }

    public String parler(String s) {
        return nom + ": " + s + "\n";
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
