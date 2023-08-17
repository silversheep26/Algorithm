import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		String str = "";
		String[] strings = t.split("");
		ArrayList<Long> longs = new ArrayList<>();

		for (int i = 0; i <= t.length() - p.length(); i++) {
			String[] a = Arrays.copyOfRange(strings, i, i+p.length());
			for (String element : a) {
				str += element;
			}
			longs.add(Long.parseLong(str));
			str = "";
		}

		System.out.println(t.length()-p.length());
		for (int i = 0; i < longs.size(); i++) {
			if (longs.get(i) <= Long.parseLong(p)) {
				answer++;
			}
		}
		return answer;
	}
}
