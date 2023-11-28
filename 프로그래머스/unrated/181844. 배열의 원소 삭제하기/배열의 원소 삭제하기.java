import java.util.*;

class Solution {
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i : arr) {
			arrayList.add(i);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) {
					arrayList.remove(Integer.valueOf(arr[i]));
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