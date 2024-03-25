class Solution {
	public int solution(String s) {
		int answer = 0;

		while (s.length() != 0) {
			answer++;
			char c = s.charAt(0);
			int same = 1;
			int diff = 0;
			for (int i = 1; i < s.length(); i++) {
				if (c == s.charAt(i)) {
					same++;
				} else {
					diff++;
				}
				if (same == diff) {
					break;
				}
			}
			s = s.substring(same + diff);
		}
		return answer;
	}
}
