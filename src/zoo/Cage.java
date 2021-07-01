package zoo;

import java.util.ArrayList;

public abstract class Cage {
	int capacity;
	ArrayList<Animal> listAnimals;
	double longueur;
	double largeur;
	double hauteur;
	String typeEnclos;
	Cage(){}
	Cage(int capacity, ArrayList<Animal> listAnimals, double longueur, double largeur, double hauteur){
		this.capacity = capacity;
		this.listAnimals =listAnimals;
		this.longueur =longueur;
		this.largeur =largeur;
		this.hauteur =hauteur;	
	}
	boolean isSuitableFor(Animal a) {
		return a.typeEnclos.equals(typeEnclos);
	}
	void ajouterAnimal(Animal a) {
		listAnimals.add(a);
	}
	public String toString() {
		return "Cage Capacity is: "+ capacity+ "\nCage Type is: "+"\nAnimals inside are: "+ listAnimals.toString()+"\nHer size is: "+longueur+"x"+largeur+"x"+hauteur;
		
	}
}
