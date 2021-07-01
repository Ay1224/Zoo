package zoo;

public abstract class Worker {
	String name;
	int age;
	String identifier;
	Worker(String name, int age, String identifier){
		this.name = name;
		this.age = age;
		this.identifier= identifier;
	}
	public String toString() {
		return "Name of the worker is "+this.name+"\nHis age is "+this.age + "\nHis identifier is "+this.identifier;
	}
}
