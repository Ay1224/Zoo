package zoo;
import java.io.*;

public abstract class Animal implements Eating {
	String name;
	int age;
	double weight;
	Moving movingBehaviour;
	String typeEnclos;
	Animal(){}
	Animal(String name, int age,double weight, String typeEnclos){
		this.name =name;
		this.age =age;
		this.weight =weight;
		this.typeEnclos = typeEnclos;	
	}
	public String toString() {
		return"\nHis name is "+ this.name + " \nHis age is "+ this.age+" \nHis weight is "+this.weight+"\nType of cage is: "+typeEnclos;
	}
}
