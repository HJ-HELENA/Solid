package solid.isp;

public class Dog implements Mammal{

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
		System.out.println("dog breed");
	}

}
