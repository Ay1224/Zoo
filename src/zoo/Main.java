package zoo;

import java.util.ArrayList;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Lion l1 = new Lion("Simba", 7, 40, true,"Enclos standard");
		Lion l2 = new Lion("Charal", 12, 60, true,"Enclos standard");
		l1.move("hunt");
		l2.move("sleep");
		// Ecrire animal dans un fichier text

//	      try {
//	         FileOutputStream fos = new FileOutputStream("input.txt");
//	         ObjectOutputStream oos = new ObjectOutputStream(fos);
//	         
//	        oos.writeObject(l1);
//	        oos.flush();
//	        oos.close();
//	      }catch(Exception e) {
//	      e.printStackTrace();
//	}
	   
		//System.out.println(l1.toString());
//		Gardian g1 = new Gardian("Jaques", 25, "IF255");
//		System.out.println(g1.toString());
		Forest f =new Forest();
		Rabbit r1= new Rabbit("Lipi", 1, 3," Terrarium", "white");
		Shark s1= new Shark("Shaky", 5, 30,"Aquarium", true);
	ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(l1);
		animalList.add(r1);
		animalList.add(s1);
		animalList.add(l2);
	 Cage c1 = new EnclosStandard(13, animalList, 20,30,10, f, 30);
	 Cage c2 = new EnclosStandard(11, animalList, 15,35,10, f, 20);
	 //System.out.println(c1.toString());
	 ArrayList<Cage> cc =new ArrayList<Cage>();
	 cc.add(c1);
	 cc.add(c2);
	 Zoo z=new Zoo(cc);
	// System.out.println(z.toString());
	 zooXMLGenerator(z);
	 Zoo z1 =zooXMLDecoder(z);
	}	
	public static void zooXMLGenerator(Zoo zoo) {

		XMLEncoder e = null;
		try {
			e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("simba.xml")));
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		}
		e.writeObject(zoo);
		e.close();
	}

	public static Zoo zooXMLDecoder(Zoo zoo) throws FileNotFoundException {
		XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("simba.xml")));
		Zoo result = (Zoo) d.readObject();
		d.close();
		System.out.println(result);
		return result;
	}
	
	}
