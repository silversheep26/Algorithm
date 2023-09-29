class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] lists = new int[number];
		for (int i = 1; i <= number; i++) {
			int cnt = 1;
			for (int j = 1; j < (i / 2) + 1; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			lists[i-1] = cnt;
		}

		for (int i = 0; i < lists.length; i++) {
			if (lists[i] > limit) {
				lists[i] = power;
			}
			answer += lists[i];
		}
		return answer;
	}
}

