package softwarecoding004;

public class SoftwareCoding004_practice011 {

	public static void main(String[] args) {
		//숫자 읽기 고급
		int kopo34_iNumVal = 1001034567;// int변수 kopo34_iNumVal를 선언하고 1001034567로 초기화한다.(한글로 읽을 숫자)
		String kopo34_sNumVal = String.valueOf(kopo34_iNumVal);// String 변수 kopo34_sNumVal을 선언하고 kopo34_iNumVal을 String으로 형 변환한 값으로 초기화한다.
		String kopo34_sNumVoice = "";// String변수 kopo34_sNumVoice를 선언하고 ""로 초기화한다. (최종적으로 숫자 -> 한글로 읽을 변수)
		System.out.printf("==> %s [%d자리]\n", kopo34_sNumVal, kopo34_sNumVal.length());// kopo34_sNumVal의 자릿수를 프린트한다.(= 배열의 길이)
		
		int kopo34_i, kopo34_j;// int변수 kopo34_i와 kopo34_j를 선언한다.
		String[] kopo34_unitS = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };// 숫자를 읽기 위한 string 배열 kopo34_unitS를 선언하고 초기화한다.
		String[] kopo34_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };// 자릿수를 읽기 위한 string 배열 kopo34_unitX를 선언하고 초기화한다.
		
		// 왼쪽부터 한개씩 처리
		kopo34_i = 0;// kopo34_i를 0으로 초기화한다.(숫자를 읽기 위한 인덱스로 활용)
		kopo34_j = kopo34_sNumVal.length() - 1;// kopo34_j를 kopo34_sNumVal 배열의 길이 - 1 의 값으로 초기화한다.(자릿수를 읽기 위한 인덱스로 활용)
		
		while (true) {// break문으로 빠져나오기 전까지 무한 반복하는 while문을 작성한다.
			if (kopo34_i >= kopo34_sNumVal.length()) {// 만약 kopo34_i가 배열의 길이와 같거나 커지면
				break;// while문을 빠져나온다.
			}
			
			System.out.printf("%s[%s]",
					kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1),// kopo34_i부터 kopo34_i + 1까지 배열의 값을 자른다. 즉, kopo34_i번의 인덱스 값만 가져온다.
					kopo34_unitS[Integer.parseInt(kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1))]);//위 값을 Integer로 변환해 숫자를 한글로 바꾼다.
			
			if (kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1).equals("0")) {// 만약 잘라낸 kopo34_sNumVal의 값이 0이라면
				if (kopo34_unitX[kopo34_j].equals("만") | kopo34_unitX[kopo34_j].equals("억")) {// 또 만약 자릿수가 "만"이거나 "억"이라면
					kopo34_sNumVoice += "" + kopo34_unitX[kopo34_j];// 값이 0이기 때문에 kopo34_sNumVoice에 자릿수만 붙여준다.
				} else {// 자릿수가 "만"이나 "억"이 아니라면 아무것도 하지 않는다. ("만"과 "억"만 숫자가 0이어도 자릿수를 붙여주기 때문)
					
				}
				
			} else {// 만약 잘라낸 kopo34_sNumVal의 값이 0이 아니라면
				kopo34_sNumVoice +=
						kopo34_unitS[Integer.parseInt(kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1))]// kopo34_i부터 kopo34_i + 1까지 배열의 값을 자른다. 즉, kopo34_i번의 인덱스 값만 가져온다.
																									    // 그리고 string을 integer로 변환해 숫자 -> 한글로 읽은 값을 가져와 kopo34_sNumVoice에 추가한다.
						+ kopo34_unitX[kopo34_j]; // 자릿수를 읽은 값을 가져와 kopo34_sNumVoice에 추가한다.
			}
			
			kopo34_i ++;// kopo34_i에 1을 더한다.(증감식)
			kopo34_j --;// kopo34_j에 1을 뺀다.(증감식)
		}
		
		System.out.printf("\n %s[%s]\n", kopo34_sNumVal, kopo34_sNumVoice);
	}
}
