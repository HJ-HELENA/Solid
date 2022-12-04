package solid.ocp;
//Open Closed Principle (개방 폐쇄 원칙)
//확장에 대해서는 open, 수정에 대해서는 closed
//기능을 추가할 때는 기존 코드를 변경하지 않고 추가 할 수 있어야 한다(-> 상속 이용)

public class WorldCup2022 {
	public void Captain() {
	
	}
}

class Korea extends WorldCup2022 {
	
	public void Captain() {
		System.out.println("손흥민");
	}
}
class Portugal extends WorldCup2022 {

	public void Captain() {
		System.out.println("호날두");
	}
} 

// 브라질 추가
 class Brazil extends WorldCup2022 {

	public void Captain() {
		System.out.println("시우바");
	}
} 

	 
 

