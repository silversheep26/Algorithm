class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		int cnt = 1;
		for (int i = left; i <= right; i++) {
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
			cnt = 1;
		}
		return answer;
	}
}