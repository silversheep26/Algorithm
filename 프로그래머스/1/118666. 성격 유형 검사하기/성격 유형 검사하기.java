import java.util.HashMap;

class Solution {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		HashMap<String, Integer> m = new HashMap<>();

		for (int i = 0; i < survey.length; i++) {
			int score = choices[i];
			String[] s = survey[i].split("");

			if (score > 0 && score < 4) {
				m.put(s[0], m.getOrDefault(s[0], 0) + 4 - score);
			} else if (score > 4) {
				m.put(s[1], m.getOrDefault(s[1], 0) + score - 4);
			}
		}

		answer += m.getOrDefault("R", 0) >= m.getOrDefault("T", 0) ? "R" : "T";
		answer += m.getOrDefault("C", 0) >= m.getOrDefault("F", 0) ? "C" : "F";
		answer += m.getOrDefault("J", 0) >= m.getOrDefault("M", 0) ? "J" : "M";
		answer += m.getOrDefault("A", 0) >= m.getOrDefault("N", 0) ? "A" : "N";
		return answer;
	}
}