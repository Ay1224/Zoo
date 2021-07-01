package zoo;

public abstract class Carnivorous extends Animal {

	Carnivorous(String name, int age, double weight, String typeEnclos) {
		super(name, age, weight, typeEnclos);
	}
	public String toEat() {
		return "Carnivorous";
	}
}
