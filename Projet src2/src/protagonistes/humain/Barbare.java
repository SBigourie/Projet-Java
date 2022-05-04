package protagonistes.humain;

public class Barbare extends Humain {
    public Barbare(String nom) {
        super(nom);
        vie=0;
    }
    public String parler(String s) {
        return "Le Barbare: "+nom+" : "+s+"\n";
    }
}
