package solid.lsp;

//리스코프 치환원칙
//상속 시 부모에서 구현한 원칙을 따라야 한다
//부모 클래스와 자식 클래스 사이는 행위가 일관되어야 한다.


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

//fish는 소리를 낼 수 없으므로 speakal interface를 implement 할 수 없다
class Fish extends Animal {
	
}
