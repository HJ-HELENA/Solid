package solid.isp;

//ISP 인터페이스 분리원칙
//하나의 일반적인 인터페이스보다는 여러개의 구체적인 인터페이스를 사용하는 것이 좋다
//사용하지 않는 기능에 종속되면 안된다

public interface Animal {
	void run();
	void eat();
}
