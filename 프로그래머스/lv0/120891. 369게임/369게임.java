class Solution {
    public int solution(int order) {
        int answer = 0;
        if (order < 10) {
			if ((order % 10) % 3 ==0 )	answer ++;
		} else {
            for (int i = 0; i < order*10; i++) {
                if (order % 10 != 0 && (order % 10) % 3 == 0) {
                    answer++;
                }
                order = order / 10;
			}
		}
        return answer;
    }
}