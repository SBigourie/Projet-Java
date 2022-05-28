package equipements.armes;
import protagonistes.EtreVivant;
import protagonistes.humain.Humain;

public class Arc extends Arme{
    protected int nombreFleche;
    protected Humain proprietaire;

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
    
    //ajout des caractéristiques de l'arme
    public void addAttaque() {
    	this.proprietaire.setDegat(this.degat);
    }

    

}
