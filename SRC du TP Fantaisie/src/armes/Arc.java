package armes;

import protagonistes.Dragon;

public class Arc extends Arme {
	protected int nombreFleche;
	
	public Arc (int nombreFleche) {
		super("arc", 30);
		this.nombreFleche = nombreFleche;
	}

	public int getNombreFleche() {
		return nombreFleche;
	}

	public String attaque (Dragon dragon) {
		if (nombreFleche > 0)
		{
			nombreFleche = nombreFleche -1;
			return super.attaque(dragon);
		}
		else 
		{
			return "Malheureusement "+ proprietaire.getNom()+ " ne possédait plus de flèches. \n";
		}
	}
}
