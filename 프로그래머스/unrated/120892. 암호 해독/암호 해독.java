class Solution {
	public String solution(String cipher, int code) {
		String answer = "";
		String[] s = cipher.split("");

		for (int i = 1; i * code <= s.length; i++) {
			answer += s[i * code - 1];
		}
		return answer;
	}
}