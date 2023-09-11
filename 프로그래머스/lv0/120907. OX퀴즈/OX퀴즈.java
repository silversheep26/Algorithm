class Solution {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] quizM = quiz[i].split(" ");
			int first = Integer.parseInt(quizM[0]);
			int second = Integer.parseInt(quizM[2]);
			int result = Integer.parseInt(quizM[4]);
			if (quizM[1].equals("+")) {
				answer[i] = ((first + second) == result) ? "O" : "X";
			} else {
				answer[i] = ((first - second) == result) ? "O" : "X";
			}
		}
		return answer;
	}
}