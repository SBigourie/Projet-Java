package setUp;

import java.util.Scanner;

import joueur.Joueur;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;
import protagonistes.affichageEtreVivant;
import protagonistes.affichageProtagonistes;
import stockage.StockEtreVivant;


public class setUp {

	public static void main(String[] args) {
		Joueur[] tabJoueurs = new Joueur[2];
		affichageEtreVivant affichageChoix = new affichageEtreVivant();
		affichageProtagonistes affichageSelonChoix = new affichageProtagonistes();
		String nomProtagoniste;
		
		int i = 0;
		int numJoueur = 1;
        Scanner scanner = new Scanner(System.in);
        TypeEtreVivant typeEtre;

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
				switch(camps) {
					case 1:
						typeEtre = TypeEtreVivant.GOBELIN;
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						System.out.println("Nom du protagoniste choisie ? :");
						nomProtagoniste = scanner.next();
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						break;
					case 2:
						typeEtre = TypeEtreVivant.HUMAIN;
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						System.out.println("Nom du protagoniste choisie ? :");
						nomProtagoniste = scanner.next();
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						break;
					case 3:
						typeEtre = TypeEtreVivant.MAGE;
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						System.out.println("Nom du protagoniste choisie ? :");
						nomProtagoniste = scanner.next();
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						break;
					case 4:
						typeEtre = TypeEtreVivant.MONSTRE;
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						System.out.println("Nom du protagoniste choisie ? :");
						nomProtagoniste = scanner.next();
						affichageSelonChoix.affichageProtagonistes(typeEtre);
						break;
					default :
						System.out.println("Choix incorrect");
				}
								
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
