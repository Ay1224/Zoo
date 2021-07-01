package zoo;

public abstract class Herbivorous extends Animal {
	Herbivorous(String name, int age, double weight, String typeEnclos) {
		super(name, age, weight, typeEnclos);
		// TODO Auto-generated constructor stub
	}

	public String toEat() {
		return "Herbivorous";
	}
}
