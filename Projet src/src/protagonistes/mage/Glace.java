package protagonistes.mage;

public class Glace extends Mage {
    public Glace(String nom) {
        super(nom,5);
    }
    public String parler(String s) {
        return "Le Mage de Glace: "+nom+" : "+s+"\n";
    }
}
