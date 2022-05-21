package protagonistes.mage;

public class Electrique extends Mage{

    public Electrique(String nom) {
        super(nom,7);
    }
    public String parler(String s) {
        return "Le Mage Electrique: "+nom+" : "+s+"\n";
    }
}
