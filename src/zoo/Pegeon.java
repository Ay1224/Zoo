package zoo;

public class Pegeon extends Omnivorous {
	String color;
	Pegeon(String name, int age,double weight, String typeEnclos, String color){
		super(name,age,weight,typeEnclos);
		this.color =color;
	}
	
	public void move(String activity) {
		switch(activity)
		{
		case "eat":
			this.movingBehaviour = new Walking();
			break;
		default:
			this.movingBehaviour = new Flying();
			break;
		}
		this.movingBehaviour.move();
	}
	public String toString() {
		return"\nPegeon is "+ this.toEat()+"\nHe moves by"+this.movingBehaviour.move() +super.toString();
	}

}
