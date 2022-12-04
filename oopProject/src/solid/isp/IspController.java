package solid.isp;

public class IspController {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();
		dog.eat();
		dog.breed();
		
		Lizard lizard = new Lizard();
		lizard.run();
		lizard.eat();
		lizard.layeggs();
	}
}
