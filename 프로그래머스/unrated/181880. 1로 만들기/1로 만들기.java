class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		int[] answerList = new int[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				if (num_list[i] % 2 == 0) { // 짝수 인 경우
					num_list[i] = num_list[i]/2;
				} else {  // 홀수인 경우
					num_list[i] = (num_list[i] - 1) / 2;
				}
				answerList[i] += 1;
			}
		}
		for (int element : answerList) {
			answer += element;
		}
		return answer;
	}
}