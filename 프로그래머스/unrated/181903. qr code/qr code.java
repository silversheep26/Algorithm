class Solution {
	public String solution(int q, int r, String code) {
		String answer = "";
		String[] codes = code.split("");

		for (int i = 0; i < codes.length; i++) {
			int index = i % q;
			if (index == r) {
				answer += codes[i];
			}
		}
		return answer;
	}
}