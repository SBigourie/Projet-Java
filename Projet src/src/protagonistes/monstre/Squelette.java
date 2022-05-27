package protagonistes.monstre;

public class Squelette extends Monstre {
    public Squelette(String nom) {
        super(nom, 50 , 150);
    }
    public String parler(String s) {
        return "Le Squelette: "+nom+" : "+s+"\n";
    }
}
