import java.util.Scanner;

public class RunAnimal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog:");
			String animal = sc.nextLine();
			
			if(animal.equalsIgnoreCase("B")){
				Bird b = new Bird();
				b.eat();
				b.sleep();
				b.makesound();
	} else if(animal.equalsIgnoreCase("C")) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.makesound();
		
	} else if(animal.equalsIgnoreCase("D")) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.makesound();
		
	}
	sc.close();
	
}
}