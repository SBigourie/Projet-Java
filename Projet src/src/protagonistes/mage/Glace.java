package protagonistes.mage;

public class Glace extends Mage {
    public Glace(String nom) {
        super(nom);
        vie = 0;
    }
    public String parler(String s) {
        return "Le Mage de Glace: "+nom+" : "+s+"\n";
    }
}
