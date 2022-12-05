package solid.isp;

//ISP 인터페이스 분리원칙
//하나의 일반적인 인터페이스보다는 여러개의 구체적인 인터페이스를 사용하는 것이 좋다
//사용하지 않는 기능에 종속되면 안된다


public class Animal2 {
	public static void main(String[] args) {
		Dog2 dog2 = new Dog2();
		dog2.run();
		dog2.eat();
		dog2.breed();
		
		Lizard2 lizard2 = new Lizard2();
		lizard2.run();
		lizard2.eat();
		lizard2.layeggs();
		
		}
}

interface Animal22 {
	void run();
	void eat();
}

interface Mammal2 extends Animal22 {
	void breed();
}

class Dog2 implements Mammal2 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eat");
	}

	@Override
	public void breed() {
		// TODO Auto-generated method stub
		System.out.println("dog breed");
	}
	
}

interface Reptile2 extends Animal22 {
	void layeggs();
}

class Lizard2 implements Reptile2 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("lizard run");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lizard eat");
	}

	@Override
	public void layeggs() {
		// TODO Auto-generated method stub
		System.out.println("lizard layeggs");
	}
	
}
