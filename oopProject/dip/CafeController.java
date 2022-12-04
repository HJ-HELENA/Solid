package solid.dip;

public class CafeController {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Coffee Americano = new Americano();
		Coffee Latte = new Latte();
		
	cafe.setCoffee(Latte);
	cafe.print();
	cafe.setCoffee(Americano);
	cafe.print();
		
		
	}
}
