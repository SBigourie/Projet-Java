package protagonistes.monstre;

public class Squelette extends Monstre {
    public Squelette(String nom) {
        super(nom);
        vie = 0;
    }
    public String parler(String s) {
        return "Le Squelette: "+nom+" : "+s+"\n";
    }
}
