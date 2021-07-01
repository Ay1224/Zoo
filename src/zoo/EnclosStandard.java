package zoo;

import java.util.ArrayList;

public class EnclosStandard extends Cage {
	EnclosStandard(int capacity, ArrayList<Animal> listAnimals, double longueur, double largeur, double hauteur, Environnement envEnclos, double surfaceEaux) {
		super(capacity, listAnimals, longueur, largeur, hauteur);
		this.envEnclos =envEnclos;
		this.surfaceEaux =surfaceEaux;
	}
	double surfaceEaux;
	Environnement envEnclos;
	public String toString() {
		return super.toString()+" Surface d'eau: "+ surfaceEaux+"l'environnement est: "+envEnclos;
	}
}
