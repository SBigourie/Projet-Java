package controleur;

import affrontement.Bataille;
import protagonistes.EtreVivant;
import protagonistes.StockEtreVivant;
import vue.SupportEcriture;

public class ControleurFaireRejoindreBataille {
	private StockEtreVivant stockEtreVivant;
	private Bataille bataille;
	SupportEcriture supportEcriture;

	public ControleurFaireRejoindreBataille(StockEtreVivant stockEtreVivant, Bataille bataille) {
		this.stockEtreVivant = stockEtreVivant;
		this.bataille = bataille;
	}
	
	public int nombreCombattant() {
		return stockEtreVivant.donnerNombrePersonnage();
	}
	
	public String afficherEtreVivant() {
		return stockEtreVivant.afficherEtreVivant();
	}

	public String faireRejoindreBataille(int numeroEtreVivant) {
		EtreVivant etreVivant = stockEtreVivant.selectionner(numeroEtreVivant);
		stockEtreVivant.supprimerEtreVivant(etreVivant);
		return etreVivant.rejointBataille(bataille);
	}
}
