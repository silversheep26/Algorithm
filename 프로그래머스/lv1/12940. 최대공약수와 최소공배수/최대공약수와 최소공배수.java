class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		int newN = Math.min(n, m);
		int newM = Math.max(n, m);


		if (newM % newN != 0) {
			for (int i = 1; i <= newM; i++) {
				if (newN % i == 0 && newM % i == 0) {
					answer[0] = i;
				}
			}
			answer[1] = (newN * newM) / answer[0];
		} else {
			answer[0] = newN;
			answer[1] = newM;
		}
		return answer;
	}
}