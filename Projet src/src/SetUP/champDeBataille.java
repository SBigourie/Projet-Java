package SetUP;


import Affichage.affichageEtreVivant;
import Affichage.affichageProtagonistes;
import affrontement.Bataille;
import protagonistes.EtreVivant;
import protagonistes.monstre.Geant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class champDeBataille implements Serializable {

	public int nbPerso;
    public int numJoueur = 1;
    private static EtreVivant[][] plateau = new EtreVivant[8][3];
    
    //initialisation de la partie avec le champ de bataille entre les deux joueurs
    public champDeBataille() {
    	//creation de la bataille avec le plateau qui est en attribut
        Bataille b = new Bataille(plateau);
        affichageEtreVivant affichageChoix = new affichageEtreVivant();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        
        //tour du joueur 1
        while (i < 1) {

            System.out.println("Joueur n°1 veuillez choisir votre camps (exemple : 1) pour Gobelin) :");
            
            //affichage des etre vivant possible à utiliser
            affichageChoix.affichage();
            int campsJoueur1 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();
            
            //permet de bien possitionner nos etre vivant dans le plateau
            int k = 0;
            int a = 0;
            
            //posstionnemnet des protagoniste du joueur 1 en haut de notre plateau (indice le plus bas)
            for (int j = 0; j < nbPerso; j++) {

                System.out.println("Choisir votre protagonsite :");
                //si le nb perso est plus grand que 3 on fais un possitionnement spécifique sur le plateau
                if (nbPerso > 3) {
                	//les 3 premiere ligne
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j, numJoueur);
                        k++;
                    //les 7 premiere lignes
                    } else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 1, a, numJoueur);
                        a++;
                        k++;
                    }
                } else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur1, b, 0, j, numJoueur);
                }
            }
            i++;
        }

        numJoueur++;

        //tour du joueur 
        while (i < 2) {

            System.out.println("Joueur n°2 veuillez choisir camps (exemple : 1) pour Gobelin) :");
            affichageChoix.affichage();
            int campsJoueur2 = scanner.nextInt();

            System.out.println("Combien de personnages voulez-vous ? (1 à 6)");
            nbPerso = scanner.nextInt();
            
            
            int k = 0;
            int a = 0;
            
            //posstionnemnet des protagoniste du joueur 2 en bas de notre plateau (indice le plus haut)
            for (int j = 0; j < nbPerso; j++) {
                System.out.println("Choisir votre protagonsite :");
                if (nbPerso > 3) {
                    if (k < 3) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, j, numJoueur);
                        k++;
                    } else if (k < 7) {
                        affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 6, a, numJoueur);
                        a++;
                        k++;
                    }
                } else {
                    affichageProtagonistes.affichageSequenceDeProtagoniste(campsJoueur2, b, 7, j, numJoueur);
                }

            }
            i++;
        }
    }


    //affichage de notre plateau avec les protagoniste dans chaque case
    public void affichage() {
        System.out.println("\n            y=0                            y=1                            y=2                ");
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                if (plateau[i][j] != null) {
                    System.out.print("| " + plateau[i][j].toString());
                } else {

                    System.out.print("|                             ");
                }
            }
            System.out.println("| x=" + i);
            System.out.println("-------------------------------------------------------------------------------------------");
        }


    }
    
    //permet de faire bouger un protagoniste dans le plateau de jeu selon un x et y de départ(choix du protagoniste a faire bouger)
    //vers s et y des destination
    public boolean moveTo(int xOrig, int yOrig, int xDest, int yDest) throws IllegalArgumentException {
        if (xDest == xOrig && yDest == yOrig) {
            throw new IllegalArgumentException("Source et destination sont les memes");
        }
        //vérification si les coordonnées sont correcte
        if (xOrig < 0 || xOrig >= 8 || xDest < 0 || xDest >= 8 || yOrig < 0 || yOrig >= 3 || yDest < 0 || yDest >= 3) {
            throw new IllegalArgumentException("Source et/ou destination pas sur le plateau");
        }
        
        //savoir si pour les coordonnes d'origine il y a un portagoniste ou non
        if (plateau[xOrig][yOrig] == null) {
            throw new IllegalArgumentException("Pas de protagonistes Ã  cette emplacement");
        }
        
        //savoir si le portagoniste choisie correspond bien au protagoniste du joueur concerné
        if (plateau[xOrig][yOrig].getJoueur() != numJoueur) {
            throw new IllegalArgumentException("Ce protagoniste ne t'appartient pas");
        }
        
        //savoir si un protagoniste du même camps est dans la case choisie en dest par le joueur
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].getJoueur() == plateau[xOrig][yOrig].getJoueur()) {
                throw new IllegalArgumentException("Un protagoniste de ton camp est deja ici");
            }
        }
        
        //savoir si un mouvement est valide
        if (plateau[xOrig][yOrig].isValid(xOrig, yOrig, xDest, yDest)) {
            throw new IllegalArgumentException("Mouvement non valide");
        }
        
        if (plateau[xOrig][yOrig].protagoniteCombat(xOrig, yOrig, xDest, yDest, plateau)) {
            throw new IllegalArgumentException("Protagoniste ici");
        }
        /**
         * si il y a un ennemie alors combat
         * si le protagoniste est tué? l'attaquant prend sa position
         * sinon il reste au même endroit
         */
        if (plateau[xDest][yDest] != null) {
            if (plateau[xDest][yDest].getJoueur() != plateau[xOrig][yOrig].getJoueur()) {
                plateau[xDest][yDest].subirAttaque(plateau[xOrig][yOrig].getDegat());
                plateau[xOrig][yOrig].subirAttaque(plateau[xDest][yDest].getDegat());
                if (plateau[xOrig][yOrig].getVie() < 0) {
                    plateau[xOrig][yOrig] = null;
                }
                //si le joueur tue son ennemie alors le protagoniste recupère entre 0 et 70 PV
                if (plateau[xDest][yDest].getVie() < 0) {
                    plateau[xOrig][yOrig].regenerer();
                    plateau[xDest][yDest] = plateau[xOrig][yOrig];
                    plateau[xOrig][yOrig] = null;
                }
             }
        }
        else {
            plateau[xDest][yDest] = plateau[xOrig][yOrig];
            plateau[xOrig][yOrig] = null;
        }
        
        //savoir quel joueur à deja jouer
        //et permet de savoir le num du joueur du prochain tour
        if (this.numJoueur == 1) {
            this.numJoueur++;
        } else {
            this.numJoueur--;
        }
        return true;
    }
    
    //savoir si un joueur a gagner la partie
    public void partieGagner() {
    	
    	//conteur permettant de savoir le nombre de protagoniste disponible sur le plateau
    	//selon le numéro du joueur inclu dans l'etrevivant
    	int contJ1 = 0;
    	int contJ2 = 0;
    	
    	//parcours du tableau
    	for (int i = 0; i < 8; i++) {
        	for (int j = 0; j < 3; j++) {
        		//si la case est vide, on ne fais rien
        		if(plateau[i][j]==null) {
        			
        		}
        		//si le num de joueur est 1 alors on incrémente le conteur du joueur 1
        		else if(plateau[i][j].getJoueur() == 1) {
					contJ1++;
					
	        	//si le num de joueur est 2 alors on incrémente le conteur du joueur 2
				}else if(plateau[i][j].getJoueur() == 2) {
					contJ2++;
				}
        	}
		}
    	
    	//si un des conteurs est égale à 0 alors le conteur en question est perdant, donc le joueur aussi
    	if(contJ1 < 1) {
    		System.out.println("Joueur 2 à WINNER");
    		System.exit(0);
    	}else if(contJ2 < 1) {
    		System.out.println("Joueur 1 à WINNER");
    		System.exit(0);
    	}
    }

    //savegarde du plateau 
    public static void saveGame() {
        try {
            FileOutputStream fos = new FileOutputStream("backup.sav");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(plateau);
            oos.flush();
            oos.close();
            System.out.println("Jeu sauvegarder \n");
        } catch (Exception e) {
            System.out.println("Erreur : problème lors de la sauvegarde \n" + e);
        }
    }

    //chargement du plateau 
    public static void loadGame() {
        try {
            FileInputStream fis = new FileInputStream("backup.sav");
            ObjectInputStream ois = new ObjectInputStream(fis);
            plateau = (EtreVivant[][]) ois.readObject();
            ois.close();
            System.out.println("Jeu charger \n");
        } catch (Exception e) {
            System.out.println("Erreur : problème lors du chargement du jeu \n" + e);
        }
    }

}
