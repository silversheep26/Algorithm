import java.util.*;

class Solution {
	public String solution(String my_string) {
		String answer = "";
		String[] myStr = my_string.toLowerCase().split("");
		Arrays.sort(myStr);

		for (String s : myStr) {
			answer += s;
		}
		System.out.println(answer);
		return answer;
	}
}
