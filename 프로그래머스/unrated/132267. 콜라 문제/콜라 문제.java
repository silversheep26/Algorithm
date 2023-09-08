class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;

		int dBottle = 0;
		int emptyBottleRest = 0;

		while (n >= a) {
			emptyBottleRest = n % a;
			dBottle = (n / a) * b;
			n = emptyBottleRest + dBottle;
            answer += dBottle;
		}

		return answer;
	}
}