package stockage;

import java.util.ArrayList;
import java.util.List;

//import Echiquier.Echiquier;
import protagonistes.EtreVivant;
import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;
import protagonistes.mage.Mage;
import protagonistes.monstre.Monstre;

public class StockEtreVivant {
    private List<Gobelin> gobelins = new ArrayList<>();
    private List<Humain> humains = new ArrayList<>();
    private List<Mage> mages = new ArrayList<>();
    private List<Monstre> monstres = new ArrayList<>();


	public void ajouterGobelin(Gobelin gobelin) {
		gobelins.add(gobelin);
    }

    public void ajouterHumain(Humain humain) {
        this.humains.add(humain);
    }

    public void ajouterMage(Mage mage) {
        mages.add(mage);
    }
    
    public void ajouterMonstre(Monstre monstre) {
        monstres.add(monstre);
    }

    public void afficherEtreVivant(EtreVivant etrevivant) {
    	String chaine = "";
    	System.out.println(etrevivant.getClass());
    }

    	/*
        int i = 1;
        for (Heros leHeros : heros) {
            chaine += "- " + i + " - le héros " + leHeros.getNom() + "\n";
            i++;
        }
        for (Homme homme : hommes) {
            chaine += "- " + i + " - l'homme " + homme.getNom() + "\n";
            i++;
        }
        for (Dragon dragon : dragons) {
            chaine += "- " + i + " - le dragon " + dragon.getNom() + "\n";
            i++;
        }
        return chaine;
    }

    /*public EtreVivant selectionner(int numero) {
        numero--;
        if (numero < heros.size()) {
            return heros.get(numero);
        }
        if (numero < heros.size() + hommes.size()) {
            numero -= heros.size();
            return hommes.get(numero);
        }
        numero -= hommes.size();
        numero -= heros.size();
        return dragons.get(numero);
    }

    public void supprimerEtreVivant(EtreVivant etreVivant) {
        if (etreVivant instanceof Heros) {
            heros.remove(etreVivant);
        } else if (etreVivant instanceof Homme) {
            hommes.remove(etreVivant);
        } else {

            dragons.remove(etreVivant);

        }
    }

    public int donnerNombrePersonnage() {
        return dragons.size() + heros.size() + hommes.size();
    }
}
*/

public static void main(String[] args) {
	StockEtreVivant e = new StockEtreVivant();
	Humain h = new Humain("Connard");
	e.afficherEtreVivant(h);
}

}