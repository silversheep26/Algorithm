import java.util.*;
class Solution {
	public String[] solution(String my_string) {
		ArrayList<String> arrayList = new ArrayList<>();
		String[] myStr = my_string.split(" ");
		for (int i = 0; i < myStr.length; i++) {
			if (!myStr[i].equals("")) {
				arrayList.add(myStr[i]);
			}
		}
		String[] answer = arrayList.toArray(new String[0]);
		return answer;
	}
}