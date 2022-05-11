package protagonistes;

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
		
	public void affichageEquipement(TypeEtreVivant typeEtre) {
				
	}
}
