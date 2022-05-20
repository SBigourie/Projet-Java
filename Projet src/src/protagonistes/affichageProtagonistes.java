package protagonistes;

import java.util.Scanner;

import stockage.stockProtagonisteChoisie;

public class affichageProtagonistes {

	
	public void affichageProtagonistes(TypeEtreVivant typeEtre) {
		
		switch (typeEtre){
			case GOBELIN:
				System.out.println("1) GOBELIN ROUGE \n2) GOBELIN VERT \n3) GOBELIN VIOLET");
				break;
			case HUMAIN:
				System.out.println("1) BARBARE \n2) CHEVALIER \n3) ROI");
				break;
			case MAGE:
				System.out.println("1) MAGE ELECTRIQUE \n2) MAGE FEU \n3) MAGE GLACE");
				break;
			case MONSTRE:
				System.out.println("1) DRAGON \n2) GEANT \n3) SQUELETTE");
				break;
		}
	}
	
	public static void affichageSequenceDeProtagoniste(int camps) {
		
	
		affichageProtagonistes affichageSelonChoixProtagoniste = new affichageProtagonistes();
		stockProtagonisteChoisie stockageProtagoniste = new stockProtagonisteChoisie();
		affichageArme affichageSelonChoixArme = new affichageArme();
		affichageEquipement affichageSelonChoixEquipement = new affichageEquipement();


		
		int protagonisteChoisie;
		int armeChoisie;
		int equipementChoisie;
        Scanner scanner = new Scanner(System.in);
        TypeEtreVivant typeEtre;
        
		//stockageProtagoniste.save(protagonisteChoisie,typeEtre);

		
		switch(camps) {
			case 1:
				typeEtre = TypeEtreVivant.GOBELIN;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				System.out.println("Choisir votre arme ? :");
				affichageSelonChoixArme.affichageSelonChoix(typeEtre);
				armeChoisie = scanner.nextInt();
				System.out.println("Choisir votre équipement ? :");
				affichageSelonChoixEquipement.affichageSelonChoix();
				equipementChoisie = scanner.nextInt();
				break;
			case 2:
				typeEtre = TypeEtreVivant.HUMAIN;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				System.out.println("Choisir votre arme ? :");
				affichageSelonChoixArme.affichageSelonChoix(typeEtre);
				armeChoisie = scanner.nextInt();
				System.out.println("Choisir votre équipement ? :");
				affichageSelonChoixEquipement.affichageSelonChoix();
				equipementChoisie = scanner.nextInt();
				break;
			case 3:
				typeEtre = TypeEtreVivant.MAGE;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				System.out.println("Choisir votre spell ? :");
				affichageSelonChoixArme.affichageSelonChoix(typeEtre);
				armeChoisie = scanner.nextInt();
				break;
			case 4:
				typeEtre = TypeEtreVivant.MONSTRE;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				break;
			default :
				System.out.println("Choix incorrect");
		}

	}
	
	public void affichageEquipement(TypeEtreVivant typeEtre) {
				
	}
}
