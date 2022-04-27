package softwarecoding007;

public class SoftwareCoding007_practice009_oneRecClass{
	
	int k34_studentId;// int 인스턴스를 생성 (학번을 저장할 변수)
	String k34_name;// String 인스턴스를 생성 (이름을 저장할 변수)
	int k34_kor;// int 인스턴스를 생성 (국어 점수를 저장할 변수)
	int k34_eng;// int 인스턴스를 생성 (영어 점수를 저장할 변수)
	int k34_mat;// int 인스턴스를 생성 (수학 점수를 저장할 변수)
	
	SoftwareCoding007_practice009_oneRecClass(int k34_studentId, String k34_name, int k34_kor, int k34_eng, int k34_mat) {// 생성자 호출 시 4개의 매개변수를 넣는다.
		this.k34_studentId = k34_studentId;// this를 붙여 해당 클래스의 k34_studentId 인스턴스 값에 매개변수로 받은 k34_studentId 값을 대입한다.
		this.k34_name = k34_name;// this를 붙여 해당 클래스의 k34_name 인스턴스 값에 매개변수로 받은 k34_name 값을 대입한다.
		this.k34_kor = k34_kor;// this를 붙여 해당 클래스의 k34_kor 인스턴스 값에 매개변수로 받은 k34_kor 값을 대입한다.
		this.k34_eng = k34_eng;// this를 붙여 해당 클래스의 k34_eng 인스턴스 값에 매개변수로 받은 k34_eng 값을 대입한다.
		this.k34_mat = k34_mat;// this를 붙여 해당 클래스의 k34_mat 인스턴스 값에 매개변수로 받은 k34_mat 값을 대입한다.
	}
	
	public int k34_studentId() {// 반환값이 int 형인 k34_studentId 메소드 정의
		return this.k34_studentId;
	}
	
	public String k34_name() {// 반환값이 String 형인 k34_name 메소드 정의
		return this.k34_name;
	}
	
	public int k34_kor() {// 반환값이 int 형인 k34_kor 메소드 정의
		return this.k34_kor;
	}
	
	public int k34_eng() {// 반환값이 int 형인 k34_eng 메소드 정의
		return this.k34_eng;
	}
	
	public int k34_mat() {// 반환값이 int 형인 k34_mat 메소드 정의
		return this.k34_mat;
	}
	
	public int k34_sum() {// 반환값이 int 형인 k34_sum 메소드 정의
		return this.k34_kor + this.k34_eng + this.k34_mat;
	}
	
	public double k34_ave() {// 반환값이 double 형인 k34_ave 메소드 정의
		return this.k34_sum() / 3.0;
	}
}
