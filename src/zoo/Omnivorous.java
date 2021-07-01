package zoo;

public abstract class Omnivorous extends Animal {
	Omnivorous(String name, int age, double weight, String typeEnclos) {
		super(name, age, weight,typeEnclos);
		// TODO Auto-generated constructor stub
	}

	public String toEat() {
		return "Omnivorous";
	}
}
