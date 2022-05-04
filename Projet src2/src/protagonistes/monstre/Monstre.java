package protagonistes.monstre;

import affrontement.Bataille;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;

public class Monstre extends EtreVivant {
    public Monstre(String nom) {
        super(nom, 200);
    }

    public String rejointBataille(Bataille bataille) {
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String mourir() {
        return "c’est ainsi que " + nom + " mourut\n"+
                bataille.eliminer(this);
    }
}
