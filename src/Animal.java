class Animal {
	public void animalsound() {
		System.out.println("Animal");

	}

}

class Pig extends Animal {

	public void animalsound() {
		System.out.println("Pig");
	}
}

class Dog extends Animal {
	public void animalsound() {
		System.out.println("Dog");
	}
}

class polymorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal Object
		Animal myPig = new Pig(); // Create a Pig Object
		Animal myDog = new Dog(); // Create a Dog Object
		myAnimal.animalsound(); // at runtime it decides which method need to call
		myPig.animalsound();
		myDog.animalsound();
	}
}