class Solution {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;
		String a = "";
		for (int i = 0; i < my_string.length(); i++) {
			a += my_string.charAt(i);
			if (a.equals(is_prefix)) {
				answer = 1;
			}
		}
		System.out.println(answer);
		return answer;
	}
}