package vue;

import java.util.Scanner;

public class Clavier {
    private static Scanner scanner = new Scanner(System.in);

    public static int entrerClavierInt() {
        int choix = 0;

        try {
            choix = scanner.nextInt();
        }
        catch(Exception e) {
            String l = scanner.next();
            System.out.println("Vous devez entrer un entier");
            entrerClavierInt();
        }

        return choix;
    }

    public static String entrerClavierString() {
        return scanner.next();
    }

}
