import java.util.*;

class Solution {
	public int[] solution(int[] numbers) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				if (!arrayList.contains(num)) {
					arrayList.add(num);
				}
			}
		}

		int[] answer = new int[arrayList.size()];

		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}