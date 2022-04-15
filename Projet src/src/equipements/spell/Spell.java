package equipements.spell;

import protagonistes.mage.Mage;

public class Spell {
	
	protected Mage proprietaire;
	protected String nature;
	
	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public Spell(String nature) {
		this.nature = nature;
	}
	
	public String useSpell() {
		return "";
	}
	
	
}
