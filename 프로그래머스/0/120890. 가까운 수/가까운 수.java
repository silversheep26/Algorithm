class Solution {
	public int solution(int[] array, int n) {
		int answer = array[0];
		int[][] a = new int[array.length - 1][2];
		int temp2 = Math.abs(array[0] - n);
		for (int i = 1; i < array.length; i++) {
			a[i - 1][0] = array[i];
			a[i - 1][1] = Math.abs(array[i] - n);
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i][1] < temp2) {
				answer = a[i][0];
				temp2 = a[i][1];
			} else if (a[i][1] == temp2) {
				answer = Math.min(a[i][0], answer);
			}
		}
		return answer;
	}
}