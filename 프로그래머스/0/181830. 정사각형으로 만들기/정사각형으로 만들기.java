class Solution {
	public int[][] solution(int[][] arr) {
		int[][] answer = {};
		int row = arr.length;
		int column = arr[0].length;

		if (row > column) {
			answer = new int[row][arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else if (row < column) {
			answer = new int[arr[0].length][column];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else {
			answer = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}

		return answer;
	}
}