import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> arrList = new ArrayList<>();

        int compare = -1;
        for (int element : arr) {
            if (compare != element){
                arrList.add(element);
                compare = element;
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}