class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        // 인덱스 값과 0~9까지 같은 숫자 찾기
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        answer = 45-count;

        return answer;
    }
}

