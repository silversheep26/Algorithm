import java.util.ArrayList;

class Solution {
	public String solution(int[] food) {
		String answer = "";
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 1; i < food.length; i++) {
			if (food[i] % 2 == 0) {
				for (int j = 0; j < food[i]/2; j++) {
					arrayList.add(i);
				}
			} else {
				if (food[i] == 1) {
					continue;
				} else {
					for (int j = 0; j < food[i]/2; j++) {
						arrayList.add(i);
					}
				}
			}
		}
		for (int i : arrayList) {
			answer += i + "";
		}
		answer += "0";
		for (int i = arrayList.size() - 1; i >= 0 ; i--) {
			answer += arrayList.get(i);
		}
		return answer;
	}
}