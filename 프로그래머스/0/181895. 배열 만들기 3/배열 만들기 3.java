import java.util.*;

class Solution {
	public int[] solution(int[] arr, int[][] intervals) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				arrayList.add(arr[j]);
			}
		}
		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}