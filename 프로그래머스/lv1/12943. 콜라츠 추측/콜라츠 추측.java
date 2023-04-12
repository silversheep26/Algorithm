class Solution {
    public int solution(int num) {
        long try1 = num;
        int answer = 0;

        while(try1 != 1) {
            for (int i = 0; i <= 500; i++) {
                if (try1 % 2 == 0) { // 짝수일 경우 1
                    try1 = try1 / 2;
                    answer++;
                    if (try1 == 1) {
                        break;
                    }
                } else {
                    try1 = (try1 * 3) + 1;
                    answer++;
                }
            }
        }
        System.out.println(answer);
        if (answer > 500) {
            answer = -1;
        }
        return answer;
    }
}