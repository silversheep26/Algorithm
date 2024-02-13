import java.util.*;

class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> integerArrayList = new ArrayList<>();
		for (int i = 0; i < intStrs.length; i++) {
			int ret = Integer.parseInt(intStrs[i].substring(s, s + l));
			if (ret > k) {
				integerArrayList.add(ret);
			}
		}

		int[] answer = new int[integerArrayList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = integerArrayList.get(i);
		}
		return answer;
	}
}
