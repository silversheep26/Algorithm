import java.util.*;

class Solution {
	public int solution(int[] array) {
		int answer = 0;
		int[][] n = new int[array.length][2];
		Arrays.sort(array);

		n[0][0] = array[0];
		n[0][1] = 1;

		int cnt = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i-1] == array[i]) {
				cnt++;
			} else {
				cnt = 0;
			}
			n[i][0] = array[i];
			n[i][1] = cnt + 1;
		}
		Arrays.sort(n, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1];

			}
		});


		if (n.length != 1) {
			if (n[n.length - 1][1] == n[n.length - 2][1]) {
				answer = -1;
			} else {
				answer = n[n.length - 1][0];
			}
		} else {
				answer = n[n.length - 1][0];
		}

		return answer;
	}
}