package protagonistes.gobelin;

public class Vert extends Gobelin{
    public Vert(String nom) {
        super(nom);
        vie = 0;
    }
    public String parler(String s) {
        return "Le Gobelin Vert: "+nom+" : "+s+"\n";
    }
}
