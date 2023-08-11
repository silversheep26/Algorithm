class Solution {
	public int solution(int balls, int share) {
		int answer = 1;
		long an = 1;

		int cnt = Math.min(balls - share, share);
		if (balls != share) {
			for (int i = 0; i < cnt; i++) {
				an *= (balls - i);
				an /= (i + 1);
			}
			answer = (int)an;
		}
		return answer;
	}
}