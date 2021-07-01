package zoo;

public class Feeder extends Worker {

	Feeder(String name, int age, String identifier) {
		super(name, age, identifier);
	}
	public String toString() {
		return super.toString()+"\nHe is a Feeder";	
		}
}
