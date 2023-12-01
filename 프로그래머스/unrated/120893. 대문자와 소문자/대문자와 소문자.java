class Solution {
	public String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split("");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(str[i].toUpperCase())) { // 대문자랑 같은 경우
				str[i] = str[i].toLowerCase();
			} else {
				str[i] = str[i].toUpperCase();
			}
		}

		for (String s : str) {
			answer += s;
		}

		return answer;
	}
}