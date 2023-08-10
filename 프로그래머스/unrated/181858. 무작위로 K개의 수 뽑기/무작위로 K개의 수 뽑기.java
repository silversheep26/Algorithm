import java.util.ArrayList;


class Solution {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		ArrayList<Integer> integers = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!integers.contains(arr[i])) {
				integers.add(arr[i]);
                if (integers.size() == k) break; 

			}
		}
		for (int i = 0; i < integers.size(); i++) {
			answer[i] = integers.get(i);
		}
		for (int i = integers.size(); i < k; i++) {
			answer[i] = -1;
		}
		return answer;
	}
}