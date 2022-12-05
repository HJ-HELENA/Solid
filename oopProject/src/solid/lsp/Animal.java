package solid.lsp;

abstract class Animal {
	
}

interface Speakable {
	void speak();
}

class Cat extends Animal implements Speakable{
	public void speak() {
	    System.out.println("냐옹");
	}
}



class Cow extends Animal implements Speakable{
	public void speak() {
	    System.out.println("음머");
	}
}

class Fish extends Animal {
	
}
