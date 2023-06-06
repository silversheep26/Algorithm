import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] newString = my_string.split("");

		Arrays.sort(indices);

		for (int i = 0; i < indices.length; i++) {
			newString[indices[i]] = "";
		}
		for (String element : newString) {
			answer += element;
		}
        return answer;
    }
}