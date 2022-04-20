package softwarecoding006;

public class SoftwareCoding006_practice010_InheritanceClass extends SoftwareCoding006_practice008_Elevator2Class{
	// Elevator2Class 클래스를 상속받아 만들었기 때문에 Elevator2Class에서 사용 가능한(public 등) 함수와 변수를 그대로 가져다 사용 가능하다.
	
	void k34_repair() {
		// Elevator2Class의 인스턴스 k34_help를 사용한다.
		k34_help = String.format("수리중 입니다.");
	}
}
