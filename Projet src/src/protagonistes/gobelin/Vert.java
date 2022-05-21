package protagonistes.gobelin;

public class Vert extends Gobelin{
    public Vert(String nom) {
        super(nom);
    }
    public String parler(String s) {
        return "Le Gobelin Vert: "+nom+" : "+s+"\n";
    }
}
