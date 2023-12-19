import java.util.*;
class Solution {
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int[] copyArray = Arrays.copyOf(array, array.length);

		Arrays.sort(array);
		for (int i = 0; i < copyArray.length; i++) {
			if (array[array.length - 1] == copyArray[i]) {
				answer[0] = copyArray[i];
				answer[1] = i;
			}
		}
		return answer;
	}
}