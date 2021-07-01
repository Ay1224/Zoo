package zoo;

public class Plant {
	String name;
	String type;
	int age;
	Plant(String name, String type, int age){
		this.name =name;
		this.type =type;
		this.age = age;
	}
	public String toString() {
		return "The name of the plant is "+ name+"\nHer type is "+ type+"\nHer age is "+age;
	}
}
