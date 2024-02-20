import java.util.*;

class Solution {
	public List solution(String myStr) {
		String temp = "";
		List<String > s = new ArrayList<>();

		for (int i = 0; i < myStr.length(); i++) {
			char v = myStr.charAt(i);
			if (v == 'a' || v == 'b' || v == 'c') {
				if (temp != "") {
					s.add(temp);
					temp = "";
				}
			} else {
				temp += v;
			}
		}
		if (temp != "") {
			s.add(temp);
			temp = "";
		}

		if (s.size() == 0) {
			s.add("EMPTY");
		}
		return s;
	}
}
