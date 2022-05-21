package protagonistes.monstre;

public class Squelette extends Monstre {
    public Squelette(String nom) {
        super(nom);
    }
    public String parler(String s) {
        return "Le Squelette: "+nom+" : "+s+"\n";
    }
}
