import java.util.*;

class Solution {
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;

		HashMap<Integer, Integer> integerHashMap = new HashMap<>();

		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				integerHashMap.put(i, rank[i]);
			} else {
				rank[i] = 0;
				integerHashMap.put(i, 0);
			}
		}

		Arrays.sort(rank);

		int count = 3;
		Loop1 : for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < integerHashMap.size(); j++) {
				if (count == 0) break Loop1;
				if (rank[i] != 0 && rank[i] == integerHashMap.get(j)) {
					answer += j * (Math.pow(10, (count-1) * 2));
					count--;
				}
			}
		}
		return answer;
	}
}