package protagonistes.humain;

public class Roi extends Humain{
    public Roi(String nom) {
        super(nom);
    }
    public String parler(String s) {
        return "Le Roi: "+nom+" : "+s+"\n";
    }
}
