package Affichage;

import java.io.Serializable;
import java.util.Scanner;


import protagonistes.TypeEtreVivant;
import protagonistes.gobelin.*;
import protagonistes.humain.*;
import protagonistes.mage.*;
import protagonistes.monstre.*;
import affrontement.Bataille;
import equipements.armes.CreationArmeSelonProtagoniste;
import equipements.armures.CreationArmureSelonProtagoniste;
import equipements.spell.CreationSpellSelonProtagoniste;

public class affichageProtagonistes implements Serializable{
	private Bataille bataille ;
	
	//afficahge des protagonistes selon l'etre vivant passé en parm
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

	//Initialisation de toute la creation des etrevivants(le protagoniste, les armes, armures) 
	//paramtere un camps
	//une bataille
	//un i et j pour le possitionnement sur le plateau
	//un numéro de joueur pour identifier le protagoniste du joueur 1 ou 2
	public static void affichageSequenceDeProtagoniste(int camps,Bataille b,int i , int j, int numJoueur) {
		
		
		affichageProtagonistes affichageSelonChoixProtagoniste = new affichageProtagonistes();
		affichageArme affichageSelonChoixArme = new affichageArme();
		affichageEquipement affichageSelonChoixEquipement = new affichageEquipement();
		CreationArmeSelonProtagoniste choixArme = new CreationArmeSelonProtagoniste();
		CreationSpellSelonProtagoniste choixSpell = new CreationSpellSelonProtagoniste();
		CreationArmureSelonProtagoniste choixArmure = new CreationArmureSelonProtagoniste();

		int protagonisteChoisie;
		int armeChoisie;
		int equipementChoisie;
        Scanner scanner = new Scanner(System.in);
        TypeEtreVivant typeEtre;
        
        //selection d'une demande spécifique selon le type d'etrevivant passé en param
		switch(camps) {
			case 1:
				//initialisation du type de l'etrevivant
				typeEtre = TypeEtreVivant.GOBELIN;
				
				//affichage selon des protagonsites selon le type 
				affichageSelonChoixProtagoniste.affichageProtagonistes(typeEtre);
				protagonisteChoisie = scanner.nextInt();
				System.out.println("Choisir votre arme ? :");
				
				//affichage arme selon le type d'être vivant
				affichageSelonChoixArme.affichageSelonChoix(typeEtre);
				armeChoisie = scanner.nextInt();
				System.out.println("Choisir votre équipement ? :");
				
				//affichage equipement selon le type d'être vivant
				affichageSelonChoixEquipement.affichageSelonChoix();
				equipementChoisie = scanner.nextInt();
				
				//creation du protagoniste de type GOBELIN avec la creation de leurs armes, armures et insertion dans le champs de bataille
				switch (protagonisteChoisie){
					case 1 :
						Rouge rouge = new Rouge("Rouge ");
						rouge.setJoueur(numJoueur);
						//creation arme et armure
						choixArme.creationArmeGobelin(armeChoisie, rouge);
						choixArmure.creationArmureGobelin(equipementChoisie, rouge);
						
						//ajout dans la bataille
						b.ajouter(rouge);
						rouge.rejointBataille(b);
						rouge.getBataille().getCampsGobelin().ajouterEtreVivant(rouge);
						
						//ajout dans le plateau de jeu
						rouge.getBataille().getPlateau()[i][j] = rouge;
						break;
					case 2:
						Violet violet = new Violet("Violet ");
						violet.setJoueur(numJoueur);
						choixArme.creationArmeGobelin(armeChoisie, violet);
						choixArmure.creationArmureGobelin(equipementChoisie, violet);
						violet.rejointBataille(b);
						violet.getBataille().getCampsGobelin().ajouterEtreVivant(violet);
						violet.getBataille().getPlateau()[i][j] = violet;
						break;
					case 3:
						Vert vert = new Vert("Vert ");
						vert.setJoueur(numJoueur);
						choixArme.creationArmeGobelin(armeChoisie, vert);
						choixArmure.creationArmureGobelin(equipementChoisie, vert);
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
							choixArme.creationArmeHumain(armeChoisie, chevalier);
							choixArmure.creationArmureHumain(equipementChoisie, chevalier);
							chevalier.rejointBataille(b);
							chevalier.getBataille().getCampsHumain().ajouterEtreVivant(chevalier);
							chevalier.getBataille().getPlateau()[i][j] = chevalier;
							break;
						case 1:
							Barbare barbare = new Barbare("Barbare ");
							barbare.setJoueur(numJoueur);
							choixArme.creationArmeHumain(armeChoisie, barbare);
							choixArmure.creationArmureHumain(equipementChoisie, barbare);
							barbare.rejointBataille(b);
							barbare.getBataille().getCampsHumain().ajouterEtreVivant(barbare);
							barbare.getBataille().getPlateau()[i][j] = barbare;
	
							break;
						case 3:
							Roi roi = new Roi("Roi ");
							roi.setJoueur(numJoueur);
							choixArme.creationArmeHumain(armeChoisie, roi);
							choixArmure.creationArmureHumain(equipementChoisie, roi);
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
							Electrique electrique = new Electrique();
							electrique.setJoueur(numJoueur);
							choixSpell.creationSpell(armeChoisie, electrique);
							electrique.rejointBataille(b);
							electrique.getBataille().getCampsMage().ajouterEtreVivant(electrique);
							electrique.getBataille().getPlateau()[i][j] = electrique;
							break;
						case 2:
							Feu feu = new Feu();
							feu.setJoueur(numJoueur);
							choixSpell.creationSpell(armeChoisie, feu);
							feu.rejointBataille(b);
							feu.getBataille().getCampsMage().ajouterEtreVivant(feu);
							feu.getBataille().getPlateau()[i][j] = feu;
							break;
						case 3:
							Glace glace = new Glace();
							glace.setJoueur(numJoueur);
							choixSpell.creationSpell(armeChoisie, glace);
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
	
}
