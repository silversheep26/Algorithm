import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);
        String[] strArray = str.split("");

        Arrays.sort(strArray);  // 배열 정렬

        String strToLong = "";

        for (int i = strArray.length-1; i >= 0; i--) {  // 배열 역순으로
            strToLong += strArray[i];
        }

        answer = Long.parseLong(strToLong); // string to long
        
        return answer;
    }
}