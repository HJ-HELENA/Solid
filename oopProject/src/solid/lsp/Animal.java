package solid.lsp;

//상속 시 부모에서 구현한 원칙을 따라야 한다

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
