class Solution {
	public int solution(String s) {
		int answer = 0;
		String[] numberStr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

		for (int i = 0; i < numberStr.length; i++) {
			if (s.contains(numberStr[i])) {
				s = s.replace(numberStr[i], i + "");
			}
		}
		answer = Integer.parseInt(s);
		return answer;
	}
}