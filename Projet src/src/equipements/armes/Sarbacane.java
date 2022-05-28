package equipements.armes;
import protagonistes.EtreVivant;
import protagonistes.gobelin.Gobelin;

public class Sarbacane extends Arme {
    protected int nombreFlechette;
    protected Gobelin proprietaire;


    public Sarbacane(int nombreFlechette) {
        super("Sarbacane",10);
        this.nombreFlechette = nombreFlechette;
    }

    public int getNombreFlechette(){
        return nombreFlechette;
    }

    public String attaque (EtreVivant etreVivant){
        if (nombreFlechette >0 ){
            nombreFlechette = nombreFlechette -1;
            return super.attaque(etreVivant);
        }
        else{
            return "Malheureusement "+ proprietaire.getNom()+ " ne possédait plus de flèches. \n";
        }
    }
    
    public void addAttaque() {
      	this.proprietaire.setDegat(this.degat);
      }
}
