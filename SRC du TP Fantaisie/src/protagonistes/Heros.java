package protagonistes;

import armes.Epee;

public class Heros extends Homme{
     public Heros(String nom){
         super(nom);
         vie = 150;
        }

        public String parler(String s) {
            return "Le héro "+nom+" : "+s+"\n";
        }

    public String prendreEpee (Epee epee) {
        return nom+" : Je prends "+epee.getNom()+"\n";
    }
}
