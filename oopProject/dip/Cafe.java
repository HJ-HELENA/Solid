package solid.dip;

public class Cafe {
	private Coffee coffee;
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;

	}
	public String drink() {
		return coffee.drink();
	}
	
	public void print() {
		System.out.println(coffee.drink());
	}
}
