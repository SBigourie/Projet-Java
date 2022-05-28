package protagonistes.mage;

public class Feu extends Mage{
    public Feu() {
        super("Mage Feu");
    }
    public String parler(String s) {
        return "Le Mage de Feu: "+nom+" : "+s+"\n";
    }
}