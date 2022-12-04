package solid.isp;

public class Lizard implements Reptile{
	@Override
	public void run() {
		System.out.println("Lizard run");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lizard eat");
	}

	@Override
	public void layeggs() {
		// TODO Auto-generated method stub
		System.out.println("Lizard layeggs");
	}
}
