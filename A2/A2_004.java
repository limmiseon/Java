package A1;

import java.util.Scanner;

public class A2_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentense = sc.nextLine();
		sentense = sentense.replace(" ", "");
		sentense = sentense.toLowerCase();
		sentense = sentense.replaceAll("[^a-z]", "");
		
		char[] charArr = sentense.toCharArray();
		int consonant = 0, vowels = 0;
		
		for(int i = 0; i < sentense.length(); i++) {
			if(charArr[i] == 'a') {
				vowels++;
			} else if(charArr[i] == 'e') {
				vowels++;
			} else if(charArr[i] == 'i') {
				vowels++;
			} else if(charArr[i] == 'o') {
				vowels++;
			} else if(charArr[i] == 'u') {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("Num. of Consonant : " + consonant);
		System.out.println("Num. of Vowels : " + vowels);
	}

}
