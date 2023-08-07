import java.util.Arrays;

class Solution {
	public String solution(String my_string, int[][] queries) {
		String answer = "";
		String[] myStr = my_string.split("");

		for (int i = 0; i < queries.length; i++) {
			String[] myStrCopy = Arrays.copyOf(myStr, myStr.length);
			int lengthQuery = queries[i][1];
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				myStr[lengthQuery] = myStrCopy[j];
				lengthQuery--;
			}
		}

		for (String e : myStr) {
			answer += e;
		}
		return answer;
	}
}