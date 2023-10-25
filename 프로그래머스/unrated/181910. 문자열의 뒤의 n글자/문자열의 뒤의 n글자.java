class Solution {
	public String solution(String my_string, int n) {
		String answer = "";
		String[] alpa = my_string.split("");

		for (int i = alpa.length - n; i < alpa.length; i++) {
			answer += alpa[i];
		}
		return answer;
	}
}