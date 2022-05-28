package SetUP;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class setUP {
	

    public static void main(String [] args) throws InterruptedException {    	
    	//creation d'un champs de bataille
        champDeBataille champDeBataille = new champDeBataille();
        String choix;
        Scanner scanner = new Scanner(System.in);
        int xOrig = 0, yOrig, xDest, yDest;
        
        //affichage du bon num�ro du joueur
        champDeBataille.numJoueur--;

        while (xOrig >= 0) {
        	
        	//affichage du plateau de jeu
            champDeBataille.affichage();
            
            //demande choix action � l'utilisateur
            System.out.println("Joueur "+ champDeBataille.numJoueur + "\nChoisir votre action (q pour quitter, s pour sauvegarder, c pour charger une partie sauvegarder et d pour d�placement) : ");
            choix = scanner.next();
            
            //demande � l'utilisateur si il veux quitter, sauvegarder, charger une partie deja sauvegarder ou se d�placer
            if(choix.equals("q")) {
            	System.exit(0);
            }else if(choix.equals("s")){
            	champDeBataille.saveGame();
                Thread.sleep(2000);
            }else if(choix.equals("c")) {
                champDeBataille.loadGame();
                Thread.sleep(2000);
            }
            else {
            	
                //demande des coordonn�es � l'utilisateur
            	 try {
                     System.out.println("Joueur "+ champDeBataille.numJoueur + " Saisir xOrig, yOrig, xDest, yDest:");
                     xOrig = scanner.nextInt();
                     yOrig = scanner.nextInt();
                     xDest = scanner.nextInt();
                     yDest = scanner.nextInt();
                     
                     //faire bouger le protagoniste
                     champDeBataille.moveTo(xOrig, yOrig, xDest, yDest);
                 } catch (InputMismatchException e) {
                     System.out.println("Mauvaise saisie");
                     scanner.nextLine();
                 } catch (IllegalArgumentException e) {
                     System.out.println("Mauvais mouvement : " + e.getMessage());
                 }
            }
            //v�rification � chaque fin de traitement si la partie est gagner par un utilistauer ou non
            champDeBataille.partieGagner();
        }
        

    }
}
