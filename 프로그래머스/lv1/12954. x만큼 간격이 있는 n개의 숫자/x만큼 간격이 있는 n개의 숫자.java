class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long j=1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = x * j;
            j++;
        }
        return answer;
    }
}