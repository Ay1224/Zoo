package zoo;
import java.io.*;
public class Lion extends Carnivorous implements Serializable {
	boolean gender;
	Lion(String name, int age,double weight, boolean gender, String typeEnclos){
		super(name,age,weight,typeEnclos);
		this.gender =gender;
	}
	public void move(String activity) {
		switch(activity)
		{
		case "hunt":
			this.movingBehaviour = new Crawling();
			break;
		default:
			this.movingBehaviour = new Walking();
			break;
		}
		this.movingBehaviour.move();
	}
	public String toString() {
		return"\nLion is "+ this.toEat()+"\nHe moves by"+this.movingBehaviour.move() +super.toString();
	}


}
