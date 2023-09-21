import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for (int i = 2 ; i <= n ; ){
            int j = 0;
            for ( ; j < primeList.size() && j <= (int)Math.sqrt(i); j++) {
                if (i%primeList.get(j) == 0) {
                    break;
                }
            }
            if (j == primeList.size() || j == (int)Math.sqrt(i) + 1) {
                primeList.add(i);
            }
            if (i<=3) {
                i++;
            }
            else {
                if (i%6 == 5){
                    int suspect = (i / 6 + 1) * 6 + 1;
                    i = suspect;
                }
                else {
                    int suspect = (i / 6 + 1) * 6 - 1;
                    i = suspect;
                }
            }
        }
        answer = primeList.size();
        return answer;
    }
}
