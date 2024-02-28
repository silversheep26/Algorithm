class Solution {
	public int solution(String s) {
		int answer = 0;
		String[] str = s.split(" ");
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("Z")) {
				answer -= Integer.parseInt(temp);
			} else {
				answer += Integer.parseInt(str[i]);
			}
			temp = str[i];
		}
		return answer;
	}
}