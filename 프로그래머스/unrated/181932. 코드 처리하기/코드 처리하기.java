class Solution {
	public String solution(String code) {
		String answer = "";
		String[] codeArray = code.split("");
		int mode = 0;
		for (int i = 0; i < codeArray.length; i++) {
			if (mode == 0) {
				if (!codeArray[i].equals("1") && (i % 2 == 0)) {
					answer += codeArray[i];
				} else if (codeArray[i].equals("1")) {
					mode = 1;
				}
			} else {
				if (!codeArray[i].equals("1") && (i % 2 != 0)) {
					answer += codeArray[i];
				} else if (codeArray[i].equals("1")) {
					mode = 0;
				}
			}
		}
		if (answer.equals("")) {
			return answer = "EMPTY";
		}
		return answer;
	}
}