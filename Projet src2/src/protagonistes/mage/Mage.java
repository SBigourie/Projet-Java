package protagonistes.mage;

import affrontement.Bataille;
import protagonistes.EtreVivant;

public class Mage extends EtreVivant {
	
	private int nbPointsAttaque;
	
    public Mage(String nom,int nbPointsAttaque){
        super(nom,100);
    }

    public int getNbPointsAttaque() {
		return nbPointsAttaque;
	}

	public void setNbPointsAttaque(int nbPointsAttaque) {
		this.nbPointsAttaque = nbPointsAttaque;
	}

	public String parler(String s) {
        return nom+": "+s+"\n";
    }

    public String rejointBataille(Bataille bataille){
        super.rejointBataille(bataille);
        return bataille.ajouter(this)  ;
    }

    public String mourir() {
        return  "c’est ainsi que le mage "+nom+" mourut\n" +
                bataille.eliminer(this);
    }
}
