class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] my_string = rny_string.split("");
		for (int i = 0; i < my_string.length; i++) {
			if (my_string[i].equals("m")) {
				answer += "rn";
			} else {
				answer += my_string[i];
			}
		}
        return answer;
    }
}