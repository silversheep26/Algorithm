import java.util.*;

class Solution {
	public int solution(String my_string) {
		int answer = 0;
		ArrayList<Character> characters = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			characters.add(my_string.charAt(i));
		}
		characters.add('c');

		String s = "";

		for (int i = 0; i < characters.size(); i++) {
			if (48 <= characters.get(i) && characters.get(i) <= 57) {
				s += characters.get(i);
			} else {
				if (!s.equals("")) {
					answer += Integer.parseInt(s);
					s = "";
				}
			}
		}
		return answer;
	}
}