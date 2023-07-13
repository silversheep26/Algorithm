class Solution {
	public String solution(String my_string, int s, int e) {
		String answer = "";
		String[] myStrList = my_string.split("");
		String[] compareList = my_string.split("");

		int j = e;
		for (int i = s; i <= e; i++) {
			String first = myStrList[s];
			myStrList[i] = compareList[j];
			j--;
		}
		for (String str : myStrList) {
			answer += str;
		}
		return answer;
	}
}