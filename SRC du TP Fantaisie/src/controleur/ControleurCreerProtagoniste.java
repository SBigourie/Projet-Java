package controleur;
import protagonistes.*;

public class ControleurCreerProtagoniste {
    StockEtreVivant stockEtreVivant;

    public ControleurCreerProtagoniste(StockEtreVivant stockEtreVivant) {
        this.stockEtreVivant = stockEtreVivant;
    }

    public void creerEtreVivant(TypeEtreVivant etreVivant, String nom) {
        switch (etreVivant){
            case HOMME -> stockEtreVivant.ajouterHomme(new Homme(nom));
            case HEROS -> stockEtreVivant.ajouterHeros(new Heros(nom));
            default -> stockEtreVivant.ajouterDragon(new Dragon(nom));
        }
    }
}
