package protagonistes.monstre;

import affrontement.Bataille;
import protagonistes.EtreVivant;

public class Monstre extends EtreVivant {
    public Monstre(String nom, int vie, int degat) {
        super(nom, vie,degat);
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
