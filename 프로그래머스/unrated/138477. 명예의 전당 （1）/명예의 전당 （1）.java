import java.util.*;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			arrayList.add(score[i]);
			Collections.sort(arrayList);
			if (arrayList.size() > k) {
				arrayList.remove(0);
			}
			answer[i] = arrayList.get(0);
		}
		return answer;
	}
}