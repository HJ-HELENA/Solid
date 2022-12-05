package solid.isp;

//ISP 인터페이스 분리원칙
//하나의 일반적인 인터페이스보다는 여러개의 구체적인 인터페이스를 사용하는 것이 좋다
//반드시 객체가 자신에게 필요한 기능만을 가지도록 제한

public interface Animal {
	void run();
	void eat();
}
