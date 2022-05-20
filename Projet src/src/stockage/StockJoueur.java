package stockage;
import joueur.Joueur;


import java.util.ArrayList;
import java.util.List;

public class StockJoueur {


    private List<Joueur> joueurs = new ArrayList<>();


    public void ajouterJoeur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public String afficherJoueur() {
        String chaine = "";
        int i = 1;
        for (Joueur leJoueur : joueurs) {
            chaine += "- " + i + " - le joueur " + leJoueur.getNomJoueur() + leJoueur.getNumJoueur() + "\n";
            i++;
        }
        return chaine;
    }

    public Joueur selectionner(int numero) {
        numero--;
        if (numero < joueurs.size()) {
            return joueurs.get(numero);
        }

        numero -= joueurs.size();

        return joueurs.get(numero);
    }


    public int donnerNombreJoueur() {
        return joueurs.size();
    }
}
