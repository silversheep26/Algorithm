class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		int[] dart = new int[3];

		int n = 0;
		int idx = 0;
		String numStr = "";

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			if ('0' <= c && c <= '9') { // 숫자인 경우
				numStr += String.valueOf(c);
			} else if (c == 'S' || c == 'D' || c == 'T') {  // single, double, triple
				n = Integer.parseInt(numStr);
				if (c == 'S') {
					dart[idx++] = (int) Math.pow(n, 1);
				} else if (c == 'D') {
					dart[idx++] = (int) Math.pow(n, 2);
				} else {
					dart[idx++] = (int) Math.pow(n, 3);
				}
				numStr = "";
			} else {  // 효과
				if (c == '*') {
					dart[idx - 1] *= 2;
					if (idx - 2 >= 0) { 
						dart[idx - 2] *= 2;
					}
				} else {
					dart[idx - 1] *= -1;
				}
			}
		}
		for (int a : dart) {
			answer += a;
		}
		System.out.println(answer);
		return answer;
	}
}