class Solution {

	public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		int[] start = new int[2];
		for (int i = 0; i < park.length; i++) { // 시작점 찾기
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') {
					start[0] = i;
					start[1] = j;
				}
			}
		}
		int H = park.length;
		int W = park[0].length();

		for (String route : routes) {
			char direction = route.charAt(0);
			int num = route.charAt(2) - '0';

			if (direction == 'E') {
				if (start[1] + num > W - 1) {
					continue;
				}

				start[1] += num;

				for (int j = start[1] - num + 1; j <= start[1]; j++) {
					if (park[start[0]].charAt(j) == 'X') {
						start[1] -= num;
						break;
					}
					;
				}
			} else if (direction == 'W') {
				if (start[1] - num < 0) {
					continue;
				}

				start[1] -= num;

				for (int j = start[1]; j <= start[1] + num; j++) {
					if (park[start[0]].charAt(j) == 'X') {
						start[1] += num;
						break;
					}
					;
				}
			} else if (direction == 'S') {
				if (start[0] + num > H - 1) {
					continue;
				}

				start[0] += num;

				for (int j = start[0] - num; j <= start[0]; j++) {
					if (park[j].charAt(start[1]) == 'X') {
						start[0] -= num;
						break;
					}
					;
				}
			} else {
				if (start[0] - num < 0) {
					continue;
				}

				start[0] -= num;

				for (int j = start[0]; j <= start[0] + num; j++) {
					if (park[j].charAt(start[1]) == 'X') {
						start[0] += num;
						break;
					}
				}
			}
		}

		answer[0] = start[0];
		answer[1] = start[1];
		return answer;
	}
}
