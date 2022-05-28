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

    //ajout des caractéristiques de l'arme au proprio
    public void addAttaque() {
      	this.proprietaire.setDegat(this.degat);
      }
}
