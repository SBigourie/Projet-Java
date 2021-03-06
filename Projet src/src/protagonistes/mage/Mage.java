package protagonistes.mage;

import affrontement.Bataille;
import protagonistes.EtreVivant;

public class Mage extends EtreVivant {
		
    public Mage(String nom){
        super(nom,100,100);
    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this)  ;
    }

    public String mourir() {
        return  "c?est ainsi que le mage "+nom+" mourut\n" +
                bataille.eliminer(this);
    }
}
