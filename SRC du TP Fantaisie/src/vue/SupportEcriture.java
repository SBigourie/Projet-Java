package vue;


public class SupportEcriture {
    static ILivre livre;

    public SupportEcriture(ILivre ilivre) {

        this.livre = ilivre;
    }

    public static void ecrire(String texte){
        livre.ecrire(texte);
    }
}
