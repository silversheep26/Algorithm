import java.util.*;

class Solution {
	public int[] solution(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				arrayList.add(arr[i]);
			}
		}
		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}