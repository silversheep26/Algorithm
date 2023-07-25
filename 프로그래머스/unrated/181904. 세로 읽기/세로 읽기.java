class Solution {
	public String solution(String my_string, int m, int c) {
		String answer = "";
		String[] myStrArray = my_string.split("");
		String[][] myStr = new String[my_string.length() / m][m];
		int element = 0;
		for (int i = 0; i < my_string.length()/m; i++) {
			for (int j = 0; j < m; j++) {
				myStr[i][j] = myStrArray[element];
				element++;
			}
		}
		for (int i = 0; i < my_string.length()/m; i++) {
			answer += myStr[i][c-1];
		}
		return answer;
	}
}