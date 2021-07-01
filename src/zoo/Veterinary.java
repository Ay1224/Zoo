package zoo;

public class Veterinary extends Worker{

	Veterinary(String name, int age, String identifier) {
		super(name, age, identifier);	
	}
	public String toString() {
		return super.toString()+"\nHe is a Veterinary";	
		}
}
