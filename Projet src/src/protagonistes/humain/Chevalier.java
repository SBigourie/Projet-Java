package protagonistes.humain;

public class Chevalier extends Humain {
     public Chevalier(String nom){
         super(nom);
        }

        public String parler(String s) {
            return "Le Chevalier: "+nom+" : "+s+"\n";
        }


}
