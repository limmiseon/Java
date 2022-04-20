package softwarecoding006;

public class SoftwareCoding006_practice006_CalcClass {
		// 메소드 오버로딩(매개변수의 형식이나 갯수가 다르면 메소드의 이름을 동일하게 사용하여 편리하게 사용할 수 있다.)
		public int k34_sum(int k34_a, int k34_b) {// int형을 반환하는 메소드 k34_sum을 정의한다.
												  // 형식 : int , 갯수 : 2 
			return k34_a + k34_b;
		}
		
		public int k34_sum(int k34_a, int k34_b, int k34_c) {// 메소드 k34_sum을 오버로딩한다.
			  											     // 형식 : int , 갯수 : 3 => 갯수가 다르므로 오버로딩 가능
			return k34_a + k34_b + k34_c;
		}
		
		public int k34_sum(int k34_a, int k34_b, int k34_c, int k34_d) {// 메소드 k34_sum을 오버로딩한다.
																	    // 형식 : int , 갯수 : 4 => 갯수가 다르므로 오버로딩 가능
			return k34_a + k34_b + k34_c + k34_d;
		}
		
		public double k34_sum(double k34_a, double k34_b) {// 메소드 k34_sum을 오버로딩한다.
														   // 형식 : double , 갯수 : 2 => 형식이 다르므로 오버로딩 가능
			return k34_a + k34_b;
		}
		
		// 이 메소드는 오버로딩 할 수 없다. 위 메소드와 매개변수가 똑같아서 구별할 수 없기 때문이다.
		//public int sum(double k34_a, double k34_b) {
	    //	return (int) (a + b)
		//}
		
}
