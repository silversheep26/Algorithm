import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public String[] solution(String myString) {

		String[] midStage = myString.split("x");
		Arrays.sort(midStage);
		List<String> arrayList = new ArrayList<>();
		for (int i = 0; i < midStage.length; i++) {
			if (!midStage[i].equals("")) {
				arrayList.add(midStage[i]);
			}
		}
		String[] answer = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}

		return answer;
	}
}