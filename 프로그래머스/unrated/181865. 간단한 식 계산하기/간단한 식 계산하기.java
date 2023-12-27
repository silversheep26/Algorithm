class Solution {
	public int solution(String binomial) {
		int answer = 0;

		String[] b = binomial.split(" ");
		int first = Integer.parseInt(b[0]);
		int second = Integer.parseInt(b[2]);

		switch (b[1]) {
			case "+":
				answer = first + second;
				break;
			case "-":
				answer = first - second;
				break;
			case "*":
				answer = first * second;
				break;
		}

		return answer;
	}
}