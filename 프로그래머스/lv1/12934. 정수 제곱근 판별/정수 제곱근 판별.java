class Solution {
    public long solution(long n) {
        long answer = 0;

        double square = Math.sqrt(n);

        if (square%1 == 0) {
            answer = (long)((square+1)*(square+1));
        } else {
            answer = -1;
        }
        return answer;
    }
}