package solid.srp;

// 단일책임원칙
public class Person {
	private String name; // 캡슐화
	private int age;
	
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
	
	public class programmer extends Person{
		public void coding() {
			System.out.println("코딩한다");
		}
	}
}
