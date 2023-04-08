import java.util.ArrayList;


class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
//         int count = 0;
//         // 인덱스 값과 0~9까지 같은 숫자 찾기
//         for (int i = 0; i < numbers.length; i++) {
//             count += numbers[i];
//         }
//         answer = 45-count;

//         return answer;
        
        

                // int to List
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Integer> notIn = new ArrayList<>();
        for (int num : numbers) {
            intList.add(num);
        }

        // contains 를 이용하여 안에 그 숫자가 있는지 확인
        for (int i = 0; i < 10; i++) {
            if (!intList.contains(i)) {
                notIn.add(i);
                answer += i;
            }
        }
        return answer;
    }
}

