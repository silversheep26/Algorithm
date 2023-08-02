class Solution {
	public int solution(int[] arr) {
		int answer = 0;
		int count = 0;
		while (answer == 0) {
			int changeCount = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
					changeCount++;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = (arr[i] * 2) + 1;
					changeCount++;
				}
			}
			count ++;
			if (changeCount == 0) {
				answer = count;
			}
		}
		System.out.println(answer);
		return answer-1;
	}
}