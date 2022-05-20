package protagonistes;

public class affichageArme {
	
	public void affichageSelonChoix(TypeEtreVivant typeEtre) {
		switch (typeEtre){
		case GOBELIN:
			System.out.println("1) SARBACANE \n2) LANCE");
			break;
		case HUMAIN:
			System.out.println("1) EPEE \n2) HACHE \n3) ARC");
			break;
		case MAGE:
			System.out.println("1) SPELL ATTAQUE \n2) SPELL POLYVALENT \n3) SPELL VIE");
			break;
		case MONSTRE:
			System.out.println("LES MONSTRES NE POSSEDE PAS D'ARME");
			break;
		}
	}

}
