package solid.srp;

// 단일책임원칙
// 하나의 클래스는 하나의 액터만을 담
public class Person {
	private String name; // 캡슐화
	private int age;
	
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
}	
	class programmer extends Person{
		public void coding() {
			System.out.println("코딩한다");
		}
	}

	class pianist extends Person{
		public void playPiano() {
			System.out.println("피아노를 친다");
		}
	}

