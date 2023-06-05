class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int whitch = myString.lastIndexOf(pat);
		answer = myString.substring(0, whitch+pat.length());
        return answer;
    }
}