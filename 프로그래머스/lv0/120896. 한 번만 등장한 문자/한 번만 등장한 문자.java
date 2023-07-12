import java.util.Arrays;

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] strings = s.split("");
		Arrays.sort(strings);
		boolean[] booleans = new boolean[strings.length];
		for (int i = 0; i < strings.length-1; i++) {
			if (strings[i].equals(strings[i + 1])) {
				booleans[i] = true;
				booleans[i+1] = true;
			}
		}
		for (int i = 0; i < strings.length; i++) {
			if (booleans[i]) {
				strings[i] = "";
			}
			answer += strings[i];
		}
		return answer;
	}
}