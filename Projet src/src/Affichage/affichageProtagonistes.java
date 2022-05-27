package Affichage;

import java.io.Serializable;
import java.util.Scanner;


import protagonistes.TypeEtreVivant;
import protagonistes.gobelin.*;
import protagonistes.humain.*;
import protagonistes.mage.*;
import protagonistes.monstre.*;
import affrontement.Bataille;

public class affichageProtagonistes implements Serializable{
	private Bataille bataille ;
	
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

	public Bataille getBataille() {
		return bataille;
	}

	public void setBataille(Bataille bataille) {
		this.bataille = bataille;
	}

	public static void affichageSequenceDeProtagoniste(int camps,Bataille b,int i , int j, int numJoueur) {
		

		affichageProtagonistes affichageSelonChoixProtagoniste = new affichageProtagonistes();
//		stockProtagonisteChoisie stockageProtagoniste = new stockProtagonisteChoisie();
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
				switch (protagonisteChoisie){
					case 1 :
						Rouge rouge = new Rouge("Rouge ");
						rouge.setJoueur(numJoueur);
						b.ajouter(rouge);
						rouge.rejointBataille(b);
						rouge.getBataille().getCampsGobelin().ajouterEtreVivant(rouge);
						rouge.getBataille().getPlateau()[i][j] = rouge;
						break;
					case 2:
						Violet violet = new Violet("Violet ");
						violet.setJoueur(numJoueur);
						violet.rejointBataille(b);
						violet.getBataille().getCampsGobelin().ajouterEtreVivant(violet);
						violet.getBataille().getPlateau()[i][j] = violet;

						break;
					case 3:
						Vert vert = new Vert("Vert ");
						vert.setJoueur(numJoueur);
						vert.rejointBataille(b);
						vert.getBataille().getCampsGobelin().ajouterEtreVivant(vert);
						vert.getBataille().getPlateau()[i][j] = vert;
						break;
				}
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
				switch (protagonisteChoisie){
					case 2 :
						Chevalier chevalier = new Chevalier("Chevalier ");
						chevalier.setJoueur(numJoueur);
						chevalier.rejointBataille(b);
						chevalier.getBataille().getCampsHumain().ajouterEtreVivant(chevalier);
						chevalier.getBataille().getPlateau()[i][j] = chevalier;
						break;
					case 1:
						Barbare barbare = new Barbare("Barbare ");
						barbare.setJoueur(numJoueur);
						barbare.rejointBataille(b);
						barbare.getBataille().getCampsHumain().ajouterEtreVivant(barbare);
						barbare.getBataille().getPlateau()[i][j] = barbare;

						break;
					case 3:
						Roi roi = new Roi("Roi ");
						roi.setJoueur(numJoueur);
						roi.rejointBataille(b);
						roi.getBataille().getCampsHumain().ajouterEtreVivant(roi);
						roi.getBataille().getPlateau()[i][j] = roi;
						break;
				}
				break;
			case 3:
				typeEtre = TypeEtreVivant.MAGE;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				System.out.println("Choisir votre spell ? :");
				affichageSelonChoixArme.affichageSelonChoix(typeEtre);
				armeChoisie = scanner.nextInt();
				switch (protagonisteChoisie){
					case 1 :
						Electrique electrique = new Electrique("Electrique ");
						electrique.setJoueur(numJoueur);
						electrique.rejointBataille(b);
						electrique.getBataille().getCampsMage().ajouterEtreVivant(electrique);
						electrique.getBataille().getPlateau()[i][j] = electrique;
						break;
					case 2:
						Feu feu = new Feu("Feu ");
						feu.setJoueur(numJoueur);
						feu.rejointBataille(b);
						feu.getBataille().getCampsMage().ajouterEtreVivant(feu);
						feu.getBataille().getPlateau()[i][j] = feu;
						break;
					case 3:
						Glace glace = new Glace("Glace ");
						glace.setJoueur(numJoueur);
						glace.rejointBataille(b);
						glace.getBataille().getCampsMage().ajouterEtreVivant(glace);
						glace.getBataille().getPlateau()[i][j] = glace;
						break;
				}
				break;
			case 4:
				typeEtre = TypeEtreVivant.MONSTRE;
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				switch (protagonisteChoisie){
					case 1 :
						Dragon dragon = new Dragon("Dragon ");
						dragon.setJoueur(numJoueur);
						dragon.rejointBataille(b);
						dragon.getBataille().getCampsMonstre().ajouterEtreVivant(dragon);
						dragon.getBataille().getPlateau()[i][j] = dragon;
						break;
					case 2:
						Geant geant = new Geant("Geant ");
						geant.setJoueur(numJoueur);
						geant.rejointBataille(b);
						geant.getBataille().getCampsMonstre().ajouterEtreVivant(geant);
						geant.getBataille().getPlateau()[i][j] = geant;

						break;
					case 3:
						Squelette squelette = new Squelette("Squelette ");
						squelette.setJoueur(numJoueur);
						squelette.rejointBataille(b);
						squelette.getBataille().getCampsMonstre().ajouterEtreVivant(squelette);
						squelette.getBataille().getPlateau()[i][j] = squelette;
						break;
				}
				break;
			default :
				System.out.println("Choix incorrect");
		}

	}
	
	public void affichageEquipement(TypeEtreVivant typeEtre) {
				
	}
}
