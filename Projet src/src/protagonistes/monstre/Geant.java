package protagonistes.monstre;

public class Geant extends Monstre{
    public Geant(String nom) {
        super(nom);
   }

    public String parler(String s) {
        return "Le géant: "+nom+" : "+s+"\n";
    }
}
