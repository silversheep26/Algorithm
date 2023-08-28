class Solution {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		int cnt = 0;
		for (int i = 0; i < num2 - num1 +1; i++) {
			answer[cnt] = numbers[i + num1];
			cnt++;
		}
		return answer;
	}
}
