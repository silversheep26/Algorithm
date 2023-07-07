class Solution {
	public int solution(int[] date1, int[] date2) {
		int answer = 0;

		String stringDate1 = "";
		String stringDate2 = "";

		for (int i = 0; i < date1.length; i++) {
			stringDate1 += date1[i] + "";
			stringDate2 += date2[i] + "";
		}
		if (Integer.parseInt(stringDate1) < Integer.parseInt(stringDate2)){
			answer = 1;
		} else answer = 0;

		return answer;
	}
}