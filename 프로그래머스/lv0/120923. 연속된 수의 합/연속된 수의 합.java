import java.util.*;

class Solution {
	public int[] solution(int num, int total) {
		ArrayList<Integer> list = new ArrayList<>();
		int a = (2 * total / num + 1 - num) / 2;
		for (int i = 0; i < num; i++) {
			list.add(a + i);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}