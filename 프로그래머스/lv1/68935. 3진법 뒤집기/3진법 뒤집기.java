import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int i = 0;
        while (n != 0){
            int rest = n%3; // 0 0 2      0
            n = n/3;  // 15 5 1           2
            integerArrayList.add(rest);
            i++;
        }
        System.out.println(integerArrayList);
        for (int j = 0 ; j < integerArrayList.size(); j++) {
            answer += integerArrayList.get(j)*(Math.pow(3, integerArrayList.size()-j-1));
        }
        return answer;
    }
}