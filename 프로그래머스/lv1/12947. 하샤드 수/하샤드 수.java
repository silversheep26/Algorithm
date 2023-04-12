class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long result = 0;
        long num = 0;

        int i = 1;
        while (i <= x) {
            result = (long)(x/i)%10;
            num += result;
            i *= 10;
        }
        if (x%num != 0) {
            answer = false;
        }
        return answer;
    }
}