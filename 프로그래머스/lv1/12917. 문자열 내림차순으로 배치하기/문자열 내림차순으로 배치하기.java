import java.util.Arrays;
import java.util.Collections;

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] strings = s.split("");

		Arrays.sort(strings, Collections.reverseOrder());
		for (String elemnent : strings) {
			answer += elemnent;
		}
		return answer;
	}
}