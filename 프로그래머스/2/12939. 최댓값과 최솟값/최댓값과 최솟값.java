import java.util.*;

class Solution {
	public String solution(String s) {
		String[] str = s.split(" ");
		int[] ints = new int[str.length];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(ints);
		String answer = ints[0] + "";
		answer += " " + (ints[ints.length - 1] + "");
		return answer;
	}
}
