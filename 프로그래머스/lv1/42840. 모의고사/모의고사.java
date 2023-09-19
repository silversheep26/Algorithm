import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
		int[] student1 = {1, 2, 3, 4, 5};
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int[][] correctCnt = new int[3][2];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[(i % student1.length)]) {
				correctCnt[0][0] = 1;
				correctCnt[0][1]++;
			}
			if (answers[i] == student2[(i % student2.length)]) {
				correctCnt[1][0] = 2;
				correctCnt[1][1]++;
			}
			if (answers[i] == student3[(i % student3.length)]) {
				correctCnt[2][0] = 3;
				correctCnt[2][1]++;
			}
		}



		Arrays.sort(correctCnt, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o2[1] - o1[1];
				}
			}
		});

		int cnt = 0;
		if (correctCnt[0][1] == correctCnt[1][1] && correctCnt[1][1] == correctCnt[2][1]) {
			cnt = 3;
		} else if (correctCnt[0][1] == correctCnt[1][1] || correctCnt[0][1] == correctCnt[2][1]) {
			cnt = 2;
		} else {
			cnt = 1;
		}

		int[] answer = new int[cnt];

		for (int i = 0; i < correctCnt.length; i++) {
			if (correctCnt[0][1] == correctCnt[i][1]) {
				answer[i] = correctCnt[i][0];
			} else {
				break;
			}
		}

		return answer;
	}
}