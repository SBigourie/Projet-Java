package protagonistes.monstre;

import protagonistes.humain.Humain;

public class Dragon extends Monstre {
    protected int nbBouleFeu = 10;

    public Dragon(String nom) {
        super(nom);
        vie = 0;
    }
    public String parler(String s) {
        return "Le Dragon"+nom+" : "+s+"\n";
    }



    public String cracheBouleFeu (Humain humain) {
        if (nbBouleFeu > 0)
        {
            nbBouleFeu = nbBouleFeu - 1;
            return (super.getNom()+" crache une boule de feu sur "+ humain.getNom()+"\n")
            + humain.subirAttaque(humain, 100);
        }
        else
        {
            return super.getNom()+" n'avait plus de feu en lui, "
                    + humain.getNom()+" a eu beaucoup de chance";
        }
    }
}
