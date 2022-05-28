package protagonistes.mage;

public class Glace extends Mage {
    public Glace() {
        super("Mage Glace");
    }
    public String parler(String s) {
        return "Le Mage de Glace: "+nom+" : "+s+"\n";
    }
}
