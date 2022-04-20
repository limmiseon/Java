package softwarecoding006;

public class SoftwareCoding006_practice013_InputDataClass{
	String[] k34_name;// String 배열 인스턴스를 생성한다. (이름을 저장할 변수)
	int[] k34_kor;// int 배열 인스턴스를 생성한다. (국어 점수를 저장할 변수)
	int[] k34_eng;// int 배열 인스턴스를 생성한다. (영어 점수를 저장할 변수)
	int[] k34_mat;// int 배열 인스턴스를 생성한다. (수학 점수를 저장할 변수)
	int[] k34_sum;// int 배열 인스턴스를 생성한다. (국어 + 영어 + 수학 점수의 합계를 저장할 변수) 
	int[] k34_avg;// double 배열 인스턴스를 생성한다. (국어 + 영어 + 수학 점수의 평균을 저장할 변수) 
	
	SoftwareCoding006_practice013_InputDataClass(int k34_integer) {// 생성자 호출 시 int형 매개변수를 넣는다.
		// 매개변수의 숫자에 따라 배열의 길이가 결정된다.
		k34_name = new String[k34_integer];
		k34_kor = new int[k34_integer];
		k34_eng = new int[k34_integer];
		k34_mat = new int[k34_integer];
		k34_sum = new int[k34_integer];
		k34_avg = new int[k34_integer];
	}
	
	void k34_setData(int k34_i, String k34_inputName, int k34_inputKor, int k34_inputEng, int k34_inputMat) {// 데이터를 저장하기 위한 메소드를 정의한다.
		// 각 배열의 k34_i번째 인덱스에 이름, 국어 점수, 수학 점수, 영어 점수, 합계, 평균이 저장된다.
		k34_name[k34_i] = k34_inputName;
		k34_kor[k34_i] = k34_inputKor;
		k34_eng[k34_i] = k34_inputEng;
		k34_mat[k34_i] = k34_inputMat;
		k34_sum[k34_i] = k34_kor[k34_i] + k34_eng[k34_i] + k34_mat[k34_i];
		k34_avg[k34_i] = k34_sum[k34_i] / 3; // 3으로 하면 int형으로 저장됨;
	}
}
