package setUp;

import java.util.Scanner;

import joueur.Joueur;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;
import protagonistes.affichageEtreVivant;
import protagonistes.affichageProtagonistes;
import stockage.StockEtreVivant;
import stockage.stockProtagonisteChoisie;


public class setUp {

	public static void main(String[] args) {
		Joueur[] tabJoueurs = new Joueur[2];
		affichageEtreVivant affichageChoix = new affichageEtreVivant();
        Scanner scanner = new Scanner(System.in);

		int i = 0;
		int numJoueur = 1;

		while (i < 2){
			System.out.println("Entrer votre nom joueur n°" + numJoueur +": ");
			String nom = scanner.next();
			tabJoueurs[i] = new Joueur(nom,numJoueur);
		
			System.out.println("Choisir votre camps (exemple : 1) pour Gobelin) :");
			affichageChoix.affichage();
			int camps = scanner.nextInt();
			
			System.out.println("Combien de personnages voulez-vous ? (1 à 10)");
			int nbPerso = scanner.nextInt();
			
			for (int j = 0; j < nbPerso; j++) {
				System.out.println("Choisir votre protagonsite :");
				affichageProtagonistes.affichageSequenceDeProtagoniste(camps);
			}
			i++;
			numJoueur++;
		}
		
		
		
		for (Joueur joueur : tabJoueurs) {
			System.out.println(joueur.getNomJoueur());
			System.out.println(joueur.getNumJoueur());
		}
		
		
	}

}
