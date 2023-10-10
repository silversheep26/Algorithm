class Solution {
	public int solution(int[][] lines) {
		int answer = 0;

		int min = (lines[0][0] < lines[1][0] && lines[0][0] < lines[2][0]) ? lines[0][0] : (lines[1][0] < lines[2][0]) ? lines[1][0] : lines[2][0];
		int max = (lines[0][1] > lines[1][1] && lines[0][1] > lines[2][1]) ? lines[0][1] : (lines[1][1] > lines[2][1]) ? lines[1][1] : lines[2][1];

		for (int i = min; i <= max; i++) {
			int cnt = 0;
			if (lines[0][0] <= i && i < lines[0][1]) {
				cnt++;
			}
			if (lines[1][0] <= i && i < lines[1][1]) {
				cnt++;
			}
			if (lines[2][0] <= i && i < lines[2][1]) {
				cnt++;
			}

			if (cnt > 1) {
				answer++;
			}
		}
		
		return answer;
	}
}