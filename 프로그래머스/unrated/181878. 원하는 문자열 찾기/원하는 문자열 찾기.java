class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStrUp = myString.toUpperCase();
        String patUp = pat.toUpperCase();
        
        if (myStrUp.contains(patUp)) {
            answer = 1;
        }
        return answer;
    }
}