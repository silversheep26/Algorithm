import java.util.ArrayList;

class Solution {
	public String solution(String bin1, String bin2) {
		String answer = "";
		int binInt1 = 0;
		int binInt2 = 0;

		String[] binStr1 = bin1.split("");
		for (int i = 0; i < binStr1.length; i++) {
			binInt1 += Integer.parseInt(binStr1[binStr1.length-i-1]) * (int)Math.pow(2,i);
		}
		String[] binStr2 = bin2.split("");
		for (int i = 0; i < binStr2.length; i++) {
			binInt2 += Integer.parseInt(binStr2[binStr2.length-i-1]) * (int)Math.pow(2,i);
		}

		int bintotal = binInt1 + binInt2;
		ArrayList<Integer> integerArrays = new ArrayList<>();

		if (bintotal == 0) {
			answer = "0";
		} else {
			while (bintotal >= 1) {
				integerArrays.add(bintotal % 2);
				bintotal = bintotal / 2;
			}
		}

		for (int i = 0; i < integerArrays.size(); i++) {
			answer += integerArrays.get(integerArrays.size() - i - 1);
		}

		return answer;
	}
}