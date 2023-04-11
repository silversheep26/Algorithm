import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (String elements : completion) {
            if (!participant[i].equals(elements)){
                return answer = participant[i];
            }
            i++;
        }
        return answer = participant[i];
    }
}