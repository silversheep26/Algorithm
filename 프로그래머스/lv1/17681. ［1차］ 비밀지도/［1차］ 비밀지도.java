class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[][] secretMap1 = new int[n][n];
		int[][] secretMap2 = new int[n][n];

		for (int i = 0; i < arr1.length; i++) {
			int a = arr1[i];
			int j = 0;
			while (j != n) {
				secretMap1[i][n - j - 1] = (a % 2);
				a /= 2;
				j++;
			}
		}


		for (int i = 0; i < arr2.length; i++) {
			int a = arr2[i];
			int j = 0;
			while (j != n) {
				secretMap2[i][n - j - 1] = (a % 2);
				a /= 2;
				j++;
			}
		}

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				if (secretMap1[i][j] == 0 && secretMap2[i][j] == 0) { // 공백 부분
					answer[i] += " ";
				} else if (secretMap1[i][j] == 1 || secretMap2[i][j] == 1) {
					answer[i] += "#";
				}
			}

		}
		return answer;
	}
}
