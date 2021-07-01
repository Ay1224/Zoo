package zoo;

public class Gardian extends Worker {

	Gardian(String name, int age, String identifier) {
		super(name, age, identifier);
	}
	public String toString() {
		return super.toString()+"\nHe is a Guardian";	
		}

}
