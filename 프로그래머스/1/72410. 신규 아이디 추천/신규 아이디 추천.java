class Solution {
	public String solution(String new_id) {
		String answer = "";

		answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^\\w\\-_.]*", "");
		answer = answer.replaceAll("\\.{2,}", ".");
		answer = answer.replaceAll("^[.]|[.]$", "");
		answer = answer.length() == 0 ? "a" : answer;

		if (16 <= answer.length()) {
			answer = answer.substring(0, 15).replaceAll("^[.]|[.]$", "");
		}

		if (answer.length() <= 2) {
			while (answer.length() <= 2) {
				answer += answer.charAt(answer.length() - 1);
			}
		}

		return answer;
	}
}