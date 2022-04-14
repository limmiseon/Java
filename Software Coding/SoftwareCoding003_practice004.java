package softwarecoding003;

public class SoftwareCoding003_practice004 {

	public static void main(String[] args) {
		// #4. 원하는 자릿수 반올림, 버림처리
		
		// 10원 이하 버려서 처리하기
		int kopo34_ii = 12345;// kopo34_ii라는 int형 변수를 선언하고 12345로 초기화한다.
		int kopo34_j = (kopo34_ii/10)*10;// kopo34_j라는 int형 변수를 선언하고 kopo34_ii를 10으로 나눈 값에 10을 곱한 값으로 초기화한다.
		System.out.printf("#4-1 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 10원 이하 반올림 처리하기(올려짐)
		kopo34_ii = 12345;// kopo34_ii에 12345를 대입한다.
		kopo34_j = ((kopo34_ii + 5)/10)*10;// kopo34_j에 kopo34_ii에 5를 더한 후 10으로 나누고 다시 10을 곱한 값을 대입한다.
		// kopo34_ii의 일의 자리가 5 이상이므로 반올림 된다.
		
		System.out.printf("#4-2 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 10원 이하 반올림 처리하기(버려짐)
		kopo34_ii = 12344;// kopo34_ii에 12344를 대입한다.
		kopo34_j = ((kopo34_ii + 5)/10)*10;// kopo34_j에 kopo34_ii에 5를 더한 후 10으로 나누고 다시 10을 곱한 값을 대입한다.
		// kopo34_ii의 일의 자리가 5 미만이므로 버림처리된다.
		
		System.out.printf("#4-3 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 100원 이하 버려서 처리하기
		kopo34_ii = 12345;// kopo34_ii에 12345를 대입한다.
		kopo34_j = (kopo34_ii/100)*100;// kopo34_j에 kopo34_ii를 100으로 나누고 다시 100을 곱한 값을 대입한다.
		
		System.out.printf("#4-4 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 100원 이하 반올림 처리하기(올려짐)
		kopo34_ii = 12355;// kopo34_ii에 12355를 대입한다.
		kopo34_j = ((kopo34_ii + 50)/100)*100;// kopo34_j에 kopo34_ii에 50을 더한 후 100으로 나누고 다시 100을 곱한 값을 대입한다.
		// kopo34_ii의 십의 자리가 5 이상이므로 반올림 된다.
		
		System.out.printf("#4-5 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 100원 이하 반올림 처리하기(버려짐)
		kopo34_ii = 12345;// kopo34_ii에 12345를 대입한다.
		kopo34_j = ((kopo34_ii + 50)/100)*100;// kopo34_j에 kopo34_ii에 50을 더한 후 100으로 나누고 다시 100을 곱한 값을 대입한다.
		// kopo34_ii의 십의 자리가 5 미만이므로 버림처리된다.
		
		System.out.printf("#4-6 : %d\n", kopo34_j);// kopo34_j를 출력한다.
	
		// 1000원 이하 버려서 처리하기
		kopo34_ii = 12345;// kopo34_ii에 12345를 대입한다.
		kopo34_j = (kopo34_ii/1000)*1000;// kopo34_j에 kopo34_ii를 1000으로 나누고 다시 1000을 곱한 값을 대입한다.
				
		System.out.printf("#4-7 : %d\n", kopo34_j);// kopo34_j를 출력한다.
		
		// 1000원 이하 반올림 처리하기(올려짐)
		kopo34_ii = 12555;// kopo34_ii에 12555를 대입한다.
		kopo34_j = ((kopo34_ii + 500)/1000)*1000;// kopo34_j에 kopo34_ii에 500을 더한 후 1000으로 나누고 다시 1000을 곱한 값을 대입한다.
		// kopo34_ii의 백의 자리가 5 이상이므로 반올림 된다.
				
		System.out.printf("#4-8 : %d\n", kopo34_j);// kopo34_j를 출력한다.		
		
		// 1000원 이하 반올림 처리하기(버려짐)
		kopo34_ii = 12455;// kopo34_ii에 12455를 대입한다.
		kopo34_j = ((kopo34_ii + 500)/1000)*1000;// kopo34_j에 kopo34_ii에 500을 더한 후 1000으로 나누고 다시 1000을 곱한 값을 대입한다.
		// kopo34_ii의 백의 자리가 5 미만이므로 버림처리된다.
		
		System.out.printf("#4-9 : %d\n", kopo34_j);// kopo34_j를 출력한다.
	}

}
