package equipements.armes;
import protagonistes.EtreVivant;

public class Sarbacane extends Arme {
    protected int nombreFlechette;

    public Sarbacane(int nombreFlechette) {
        super("sarbacane",0);
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
}
