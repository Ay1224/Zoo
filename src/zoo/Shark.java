package zoo;

public class Shark extends Carnivorous {
	boolean gender;
	Shark(String name, int age,double weight, String typeEnclos, boolean gender){
		super(name,age,weight,typeEnclos);
		this.gender =gender;
	}
	public String move() {
		return "Flying";
	}
	public String toString() {
		return"\nShark is "+ this.toEat()+"\nHe moves by"+this.move() +super.toString();
	}
}
