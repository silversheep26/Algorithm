class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);  // Long 타입을 String으로 변환

        char[] chars = str.toCharArray();
        int[] answer = new int[chars.length];

        int j = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            answer[i] = chars[j]-'0';
            j--;
        }
        return answer;
    }
}