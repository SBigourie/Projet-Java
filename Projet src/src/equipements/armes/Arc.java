package equipements.armes;
import protagonistes.EtreVivant;

public class Arc extends Arme{
    protected int nombreFleche;

    public Arc(int nombreFleche) {
        super("arc", 15);
        this.nombreFleche = nombreFleche;
    }

    public int getNombreFleche(){
        return nombreFleche;
    }

    public String attaque (EtreVivant etreVivant){
        if (nombreFleche >0 ){
            nombreFleche = nombreFleche -1;
            return super.attaque(etreVivant);
        }
        else{
            return "Malheureusement "+ proprietaire.getNom()+ " ne possédait plus de flèches. \n";
        }
    }

}
