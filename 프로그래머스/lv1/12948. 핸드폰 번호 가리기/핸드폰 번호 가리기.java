class Solution {
    public String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();

        // 인덱스 4개 빼고
        for (int i = 0; i < chars.length-4; i++) {
            chars[i] = '*';
        }
        String answer = new String(chars);

        return answer;
    }
}