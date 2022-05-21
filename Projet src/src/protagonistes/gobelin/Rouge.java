package protagonistes.gobelin;

public class Rouge extends Gobelin{
    public Rouge(String nom) {
        super(nom);
    }
    public String parler(String s) {
        return "Le Gobelin Rouge: "+nom+" : "+s+"\n";
    }
}
