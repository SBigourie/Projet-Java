package protagonistes.gobelin;

public class Violet extends Gobelin {
    public Violet(String nom) {
        super(nom);
    }
    public String parler(String s) {
        return "Le Gobelin Vert: "+nom+" : "+s+"\n";
    }
}
