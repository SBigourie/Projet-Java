package protagonistes.mage;

public class Electrique extends Mage{

    public Electrique() {
        super("Mage Electrique");
    }
    
    public String parler(String s) {
        return "Le Mage Electrique: "+nom+" : "+s+"\n";
    }
}
