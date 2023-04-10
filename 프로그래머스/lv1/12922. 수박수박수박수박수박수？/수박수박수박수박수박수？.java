import java.util.ArrayList;

class Solution {
    public String solution(int n) {
        String answer = "";
        ArrayList<String> strArrayList = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            if (i%2 != 0){
                strArrayList.add("수");
            } else {
                strArrayList.add("박");
            }
        }

        for (String elements :
                strArrayList) {
            answer += elements;
        }
        return answer;
    }
}