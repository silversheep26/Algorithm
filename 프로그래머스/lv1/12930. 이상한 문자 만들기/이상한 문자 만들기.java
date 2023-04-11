class Solution {
    public String solution(String s) {
        String answer = "";
        // string 을 char 배열로

        String[] strArray = s.split("");

        int idx = 0;  // 띄어쓰기 자리

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(" ")) {  // 띄어쓰기인지 확인
                idx = 0;
            } else if (idx % 2 != 0) {  // 홀수
                strArray[i] = strArray[i].toLowerCase();
                idx++;
            } else {
                strArray[i] = strArray[i].toUpperCase();
                idx++;
            }
            answer += strArray[i];
        }
        return answer;
    }
}