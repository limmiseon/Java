
public class Java003_A2 {
	public static void main(String[] args) {
		String val = "I go to school";
		val = val.toUpperCase();
		char[] charArr = val.toCharArray();
		int length = val.length();
		char[] alphaArr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] counter = new int[26];

		for (int i = 0; i < length; i++) {
			if (charArr[i] == 'A') {
				counter[0]++;
			} else if (charArr[i] == 'B') {
				counter[1]++;
			} else if (charArr[i] == 'C') {
				counter[2]++;
			} else if (charArr[i] == 'D') {
				counter[3]++;
			} else if (charArr[i] == 'E') {
				counter[4]++;
			} else if (charArr[i] == 'F') {
				counter[5]++;
			} else if (charArr[i] == 'G') {
				counter[6]++;
			} else if (charArr[i] == 'H') {
				counter[7]++;
			} else if (charArr[i] == 'I') {
				counter[8]++;
			} else if (charArr[i] == 'J') {
				counter[9]++;
			} else if (charArr[i] == 'K') {
				counter[10]++;
			} else if (charArr[i] == 'L') {
				counter[11]++;
			} else if (charArr[i] == 'M') {
				counter[12]++;
			} else if (charArr[i] == 'N') {
				counter[13]++;
			} else if (charArr[i] == 'O') {
				counter[14]++;
			} else if (charArr[i] == 'P') {
				counter[15]++;
			} else if (charArr[i] == 'Q') {
				counter[16]++;
			} else if (charArr[i] == 'R') {
				counter[17]++;
			} else if (charArr[i] == 'S') {
				counter[18]++;
			} else if (charArr[i] == 'T') {
				counter[19]++;
			} else if (charArr[i] == 'U') {
				counter[20]++;
			} else if (charArr[i] == 'V') {
				counter[21]++;
			} else if (charArr[i] == 'W') {
				counter[22]++;
			} else if (charArr[i] == 'X') {
				counter[23]++;
			} else if (charArr[i] == 'Y') {
				counter[24]++;
			} else if (charArr[i] == 'Z') {
				counter[25]++;
			} else {
				continue;
			}
		}
		
		int j = 0;
		while (j < 26) {
			if (counter[j] != 0) {
				System.out.println(alphaArr[j] + " - " + counter[j]);
			}
			j++;
		}
	}
}
