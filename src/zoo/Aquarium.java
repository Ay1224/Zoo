package zoo;

import java.util.ArrayList;

public class Aquarium extends Cage {
	double tauxSel;
	Aquarium(int capacity, ArrayList<Animal> listAnimals, double longueur, double largeur, double hauteur, double tauxSel) {
		super(capacity, listAnimals, longueur, largeur, hauteur);
		this.tauxSel = tauxSel;
	}

	public String toString() {
		return super.toString()+"saltAmount is" + tauxSel ;
	}
}
