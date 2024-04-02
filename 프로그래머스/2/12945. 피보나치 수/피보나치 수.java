class Solution {
	public int solution(int n) {
		int answer = 0;

		int[] seq = new int[n + 1];
		seq[0] = 0;
		seq[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			seq[i] = (seq[i - 2] + seq[i - 1]) % 1234567;
		}
		answer = seq[seq.length - 1];
		return answer;
	}
}