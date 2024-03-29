class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int cnt = 0;
		int dontknow = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					lottos[i] = 50;
					cnt++;
				}
			}
			if (lottos[i] == 0) {
				dontknow++;
			}
		}
		answer[1] = cnt;
		answer[0] = dontknow + cnt;

		for (int i = 0; i < answer.length; i++) {
			switch (answer[i]) {
				case 6:
					answer[i] = 1;
					break;
				case 5 :
					answer[i] = 2;
					break;
				case 4 :
					answer[i] = 3;
					break;
				case 3 :
					answer[i] = 4;
					break;
				case 2 :
					answer[i] = 5;
					break;
				default :
					answer[i] = 6;
					break;
			}
		}
		return answer;
	}
}