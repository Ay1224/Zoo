package zoo;

import java.util.ArrayList;

public class Zoo {
	ArrayList<Cage> listeEnclos;
	Zoo(ArrayList<Cage> listeEnclos){
		this.listeEnclos=listeEnclos;
	}

	public void ajouterAnimal(Animal a, Cage c) {
		c.ajouterAnimal(a);
	}
	ArrayList<Cage> trouverEnclosAdapte(Animal a){
		ArrayList<Cage> lc= new ArrayList<Cage>();
		for(Cage c :listeEnclos)
			if (c.isSuitableFor(a))
				lc.add(c);
		return lc;}
	boolean verifierSiEnclosAdapte(Animal a) {
		
		return false;}
	public String toString() {
		return "Zoo: "+  listeEnclos.toString();
	}
}
