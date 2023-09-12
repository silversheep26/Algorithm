import java.util.ArrayList;

class Solution {
	public int[] solution(int[] arr, int[] query) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (Integer i : arr) {
			arrayList.add(i);
		}
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				while (arrayList.size() != query[i] + 1) {
					arrayList.remove(arrayList.size()-1);
				}
			} else {
				for (int j = 0; j < query[i]; j++) {
					arrayList.remove(0);
				}
			}
		}

		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}