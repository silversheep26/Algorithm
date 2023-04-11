class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = 0;

        int i = 1;
        while (i <= n){
            result = (double)(n/i)%10;
            answer += result;
            i *= 10;
        }
        return answer;
    }
}