class Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += 1;
			String str = answer + "";
			if (answer % 3 == 0 || str.contains("3")) {
				while (answer % 3 == 0 || str.contains("3")) {
                    answer++;
					str = answer + "";
				}
			}
		}
		return answer;
	}
}