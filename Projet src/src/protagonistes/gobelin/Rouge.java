package protagonistes.gobelin;

public class Rouge extends Gobelin{
    public Rouge(String nom) {
        super(nom);
        vie = 0;
    }
    public String parler(String s) {
        return "Le Gobelin Rouge: "+nom+" : "+s+"\n";
    }
}
