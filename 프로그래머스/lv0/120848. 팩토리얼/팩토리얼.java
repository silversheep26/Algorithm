class Solution {
	public int solution(int n) {
		int answer = 0;
		int factorial = 1;
		for (int i = 1; i < n+2; i++) {
			factorial *= i;
			if (n < factorial) {
				answer = i-1;
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
}