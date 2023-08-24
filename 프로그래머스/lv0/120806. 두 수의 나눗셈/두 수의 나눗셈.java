class Solution {
    public int solution(int num1, int num2) {
        boolean val1 = (0 < num1 && num1 <= 100);
        boolean val2 = (0 < num2 && num2 <= 100);
        double val3 = ((double)num1 / (double)num2) * 1000;
        int answer = (int)val3;
        return answer;
    }
}