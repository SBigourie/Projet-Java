package affrontement;

import protagonistes.*;
import protagonistes.gobelin.Gobelin;
import protagonistes.humain.Humain;
import protagonistes.mage.Mage;
import protagonistes.monstre.Monstre;

public class Bataille {
	private Camps campsHumain = new Camps();
	private Camps campsMonstre = new Camps();
	private Camps campsGobelin = new Camps();
	private Camps campsMage = new Camps();

	public String ajouter(Humain humain) {
		String texte = "";
		campsHumain.ajouterEtreVivant(humain);
		if (campsHumain.nbCompagnon() > 1) {
			texte = humain.parler("Bonjour, je m'appelle " + humain.getNom() + " et je viens me joindre au combat.");
		} else {
			texte += (humain.getNom()
					+ " est le premier à se joindre à la dernière bataille entre les Hommes et les dragons.\n");
		}
		return texte;
	}

	public String ajouter(Monstre monstre) {
		String texte = "";
		campsMonstre.ajouterEtreVivant(monstre);
		if (campsMonstre.nbCompagnon() > 1) {
			texte = ("Un nouveau montre " + monstre.getNom() + " s'approchait du champ de bataille.\n");
		} else {
			texte = "Le monstre " + monstre.getNom() + " fut le premier à arriver sur le champ de bataille.\n";
		}
		return texte;
	}

	public String ajouter(Gobelin gobelin) {
		String texte = "";
		campsGobelin.ajouterEtreVivant(gobelin);
		if (campsGobelin.nbCompagnon() > 1) {
			texte = ("Un nouveau gobelin " + gobelin.getNom() + " s'approchait du champ de bataille.\n");
		} else {
			texte = "Le gobelin " + gobelin.getNom() + " fut le premier à arriver sur le champ de bataille.\n";
		}
		return texte;
	}

	public String ajouter(Mage mage) {
		String texte = "";
		campsMage.ajouterEtreVivant(mage);
		if (campsMage.nbCompagnon() > 1) {
			texte = ("Un nouveau mage " + mage.getNom() + " s'approchait du champ de bataille.\n");
		} else {
			texte = "Le mage " + mage.getNom() + " fut le premier à arriver sur le champ de bataille.\n";
		}
		return texte;
	}

	public String eliminer(Monstre monstre) {
		String texte = "";
		campsMonstre.supprimerCompagnon(monstre);
		if (campsMonstre.nbCompagnon() == 0 && campsHumain.nbCompagnon() > 0) {
			texte = "Les Hommes ont conquis la lande, leurs villages n'auront plus jamais à trembler devant les dragons.\n";
		}
		return texte;
	}

	public String eliminer(Humain humain) {
		String texte = "";
		campsHumain.supprimerCompagnon(humain);
		if (campsHumain.nbCompagnon() == 0 && campsMonstre.nbCompagnon() > 0) {
			texte = "Les dragons ont conquis la lande, les Hommes n'ont pas pu survivre dans ce monde hostile.\n";
		}
		return texte;
	}

	public String eliminer(Mage mage) {
		String texte = "";
		campsMage.supprimerCompagnon(mage);
		if (campsHumain.nbCompagnon() == 0 && campsMonstre.nbCompagnon() > 0) {
			texte = "Les dragons ont conquis la lande, les Hommes n'ont pas pu survivre dans ce monde hostile.\n";
		}
		return texte;
	}

	public String eliminer(Gobelin gobelin) {
		String texte = "";
		campsGobelin.supprimerCompagnon(gobelin);
		if (campsHumain.nbCompagnon() == 0 && campsMonstre.nbCompagnon() > 0) {
			texte = "Les dragons ont conquis la lande, les Hommes n'ont pas pu survivre dans ce monde hostile.\n";
		}
		return texte;
	}

	public EtreVivant selectionner(TypeEtreVivant typeEtreVivant, int numero) {
		if (typeEtreVivant == TypeEtreVivant.HUMAIN) {
			return campsHumain.selectionner(numero);
		} else if (typeEtreVivant == TypeEtreVivant.MONSTRE){
			return campsMonstre.selectionner(numero);
		}else if (typeEtreVivant == TypeEtreVivant.GOBELIN){
			return campsGobelin.selectionner(numero);
		}else {
			return campsMage.selectionner(numero);
		}
	}

	public String afficherCamp(TypeEtreVivant typeEtreVivant) {
		if (typeEtreVivant == TypeEtreVivant.HUMAIN) {
			return campsHumain.afficherCamp();
		} else {
			return campsMonstre.afficherCamp();
		}
	}

	public int donnerNombreHumain() {
		return campsHumain.nbCompagnon();
	}
	public int donnerNombreMonstre() {
		return campsMonstre.nbCompagnon();
	}
	public int donnerNombreGobelin() {
		return campsGobelin.nbCompagnon();
	}
	public int donnerNombreMage() {
		return campsMage.nbCompagnon();
	}

}
