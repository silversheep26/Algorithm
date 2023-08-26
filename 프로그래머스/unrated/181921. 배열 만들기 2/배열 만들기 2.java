import java.util.ArrayList;

class Solution {
	public int[] solution(int l, int r) {

		ArrayList<Integer> integerArrayList = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			int cnt = 0;
			String a = String.valueOf(i);
			String[] strings = a.split("");
			for (int j = 0; j < strings.length; j++) {
				if (strings[j].equals("5") || strings[j].equals("0")) {
					cnt ++;
					if (cnt == strings.length) {
						integerArrayList.add(i);
					}
				} else break;
			}
		}

		int[] answer = new int[integerArrayList.size()];
		if (answer.length == 0) {
			answer = new int[]{-1};
		} else {
			for (int i = 0; i < integerArrayList.size(); i++) {
				answer[i] = integerArrayList.get(i);
			}
		}

		return answer;
	}
}