class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String[] myStr = my_string.split("");
		String[] overStr = overwrite_string.split("");
		int idx = 0;
		for (int i = 0; i < myStr.length; i++) {
			if (i < s) {
				answer += myStr[i];
			} else {
				if (idx < overStr.length) {
					answer += overStr[idx];
					idx++;
				} else {
					answer += myStr[i];
				}
			}
		}
		return answer;
	}
}