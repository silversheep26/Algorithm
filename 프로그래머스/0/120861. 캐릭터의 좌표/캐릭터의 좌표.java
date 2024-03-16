class Solution {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];
		int boardSizeWidth = board[0]/2;
		int boardSizeLength = board[1]/2;

		for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("up") && answer[1] < boardSizeLength) {
				answer[1]++;
			} else if (keyinput[i].equals("down") && -boardSizeLength < answer[1]) {
				answer[1]--;
			} else if (keyinput[i].equals("right") && answer[0] < boardSizeWidth) {
				answer[0]++;
			} else if (keyinput[i].equals("left") && -boardSizeWidth < answer[0]) {
				answer[0]--;
			}
		}
		return answer;
	}
}