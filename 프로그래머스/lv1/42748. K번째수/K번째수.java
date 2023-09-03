import java.util.*;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> integerArrayList = new ArrayList<>();
		ArrayList<Integer> integers = new ArrayList<>();

		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			int cnt = 0;
			for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
				temp[cnt] = array[j];
				cnt++;
			}
			Arrays.sort(temp);
			integerArrayList.add(temp[commands[i][2]-1]);
		}
        int[] answer = new int[integerArrayList.size()];
		for (int i = 0; i < integerArrayList.size(); i++) {
			answer[i] = integerArrayList.get(i);
		}
		return answer;
	}
}