package protagonistes.mage;

public class Feu extends Mage{
    public Feu(String nom) {
        super(nom,10);
    }
    public String parler(String s) {
        return "Le Mage de Feu: "+nom+" : "+s+"\n";
    }
}