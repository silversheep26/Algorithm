import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> stringArrayList = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < todo_list.length; i++) {
			if (!finished[i]) {
				stringArrayList.add(todo_list[i]);
					j++;
			}
		}
		String[] answer = new String[stringArrayList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stringArrayList.get(i);
		}
        return answer;
    }
}