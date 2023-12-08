import java.util.*;

class Solution {
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				arrayList.add(numlist[i]);
			}
		}

		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arrayList.get(i);
		}

		return answer;
	}
}