package protagonistes;

import affrontement.Bataille;

public class Dragon extends EtreVivant {
    protected int nbBouleFeu = 10;

    public Dragon(String nom) {
        super(nom, 200);
    }

    public String rejointBataille(Bataille bataille) {
        super.rejointBataille(bataille);
        return bataille.ajouter(this);
    }

    public String mourir() {
        return "c’est ainsi que le dragon " + nom + " mourut\n"+
                bataille.eliminer(this);
    }

    public String cracheBouleFeu (Homme homme) {
        if (nbBouleFeu > 0)
        {
            nbBouleFeu = nbBouleFeu - 1;
            return (super.getNom()+" crache une boule de feu sur "+homme.getNom()+"\n")
            + homme.subirAttaque(homme, 100);
        }
        else
        {
            return super.getNom()+" n'avait plus de feu en lui, "
                    +homme.getNom()+" a eu beaucoup de chance";
        }
    }
}
