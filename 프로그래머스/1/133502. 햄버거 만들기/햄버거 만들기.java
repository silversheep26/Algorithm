class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < ingredient.length; i++) {
			s.append(ingredient[i]);
			if (s.length() > 3 && s.subSequence(s.length() - 4, s.length()).equals("1231")) {
				answer++;
				s.delete(s.length() - 4, s.length());
			}
		}
		return answer;
	}
}