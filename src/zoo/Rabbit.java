package zoo;

public class Rabbit extends Herbivorous {
	String color;
	Rabbit(String name, int age,double weight, String typeEnclos, String color){
		super(name,age,weight,typeEnclos);
		this.color =color;
	}
	public String move() {
		return "Walking"; 
	}
	public String toString() {
		return"\nRabbit is "+ this.toEat()+"\nHe moves by"+this.move() +super.toString();
	}

}
