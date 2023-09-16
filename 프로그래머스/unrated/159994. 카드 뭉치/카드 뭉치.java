import java.util.*;

class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		ArrayList<String> arrayCard1 = new ArrayList<>(Arrays.asList(cards1));
		ArrayList<String> arrayCard2 = new ArrayList<>(Arrays.asList(cards2));

		for (int i = 0; i < goal.length; i++) {
			if (arrayCard1.size() > 0 && goal[i].equals(arrayCard1.get(0))) {
				arrayCard1.remove(0);
			} else if (arrayCard2.size() > 0 && goal[i].equals(arrayCard2.get(0))) {
				arrayCard2.remove(0);
			} else {
				answer = "No";
			}
		}
		return answer;
	}
}