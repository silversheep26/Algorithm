import java.util.*;

class Solution {
	public int solution(String before, String after) {
		int answer = 0;
		String[] beforeArray = before.split("");
		String[] afterArray = after.split("");
		boolean[] booleans = new boolean[beforeArray.length];

		ArrayList<String> beforeList = new ArrayList<>();
		ArrayList<String> afterList = new ArrayList<>();

		beforeList.addAll(Arrays.asList(beforeArray));
		afterList.addAll(Arrays.asList(afterArray));

		for (int i = 0; i < beforeList.size(); i++) {
			for (int j = 0; j < afterList.size(); j++) {
				if (beforeList.get(i).equals(afterList.get(j))) {
					booleans[i] = true;
					afterList.remove(j);
					break;
				} else booleans[i] =false;
			}
		}

		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				answer = 1;
			} else {
				answer = 0;
				break;
			}

		}
		return answer;
	}
}