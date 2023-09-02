import java.util.*;

class Solution {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		String[][] str = new String[strings.length][2];

		for (int i = 0; i < strings.length; i++) {
			str[i][0] = strings[i].charAt(n) + "";
			str[i][1] = strings[i];
		}

		Arrays.sort(str, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].toString().contentEquals(o2[0].toString()))
					return o1[1].toString().compareTo(o2[1].toString());
				else
					return o1[0].toString().compareTo(o2[0].toString());
			}
		});

		for (int i = 0; i < strings.length; i++) {
			answer[i] = str[i][1];
		}
		return answer;
	}
}