package setUp;

import java.util.Scanner;

import joueur.Joueur;
import protagonistes.EtreVivant;
import protagonistes.TypeEtreVivant;
import stockage.StockEtreVivant;


public class setUp {

	public static void main(String[] args) {
		Joueur[] tabJoueurs = new Joueur[2];
		int i = 0;
		int numJoueur = 1;
        Scanner scanner = new Scanner(System.in);
        TypeEtreVivant typeEtre;

		while (i < 2){
			System.out.println("Entrer votre nom joueur n°" + numJoueur +": ");
			String nom = scanner.next();
			tabJoueurs[i] = new Joueur(nom);
			
			System.out.println("Choisir votre camps (exemple : 1) pour Gobelin) : \n" + "1) Gobelin \n2) Humain \n3) Mage \n4) Monstre ");
			int camps = scanner.nextInt();

			switch(camps) {
				case 1:
					typeEtre = TypeEtreVivant.GOBELIN;
					break;
				case 2:
					typeEtre = TypeEtreVivant.HUMAIN;
					break;
				case 3:
					typeEtre = TypeEtreVivant.MAGE;
					break;
				case 4:
					typeEtre = TypeEtreVivant.MONSTRE;
					break;
				default :
				System.out.println("Choix incorrect");	
			}
			
			//StockEtreVivant.afficherEtreVivant(typeEtre);
			
			
			
				
			
			
			i++;
			numJoueur++;
		}
		
		for (Joueur joueur : tabJoueurs) {
			System.out.println(joueur.getNomJoueur());
		}
		
		
	}

}
