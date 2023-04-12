import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] find = new int[arr.length-1];
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int idx = 0;

        Arrays.sort(copyArr);  // 제일 작은 수가 무엇인지 확인
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != copyArr[0]) {
                    find[idx] = arr[i];
                    idx++;
                }
            }
            answer = Arrays.copyOf(find, find.length);
        }        
        return answer;
    }
}