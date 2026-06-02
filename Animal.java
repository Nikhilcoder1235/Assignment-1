package First;


class AnimalSound {
	void sound() {
		System.out.println("Animal makes Sound");
	}
	
}
class Dog {
	void sound() {
		System.out.println("Dog Bark");
	}
}
public class Animal {
	public static void main(String args[]) {
		Dog ref = new Dog();
		
		ref.sound();
	}

}
