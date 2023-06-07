class Solution {
    public int[] solution(int[] num_list, int n) {
		int length;
		int[] answer = {};
		if (num_list.length%n == 0) {
			length = num_list.length/n;
		} else {
			length = (num_list.length/n) +1;
		}
		answer = new int[length];

		for (int i = 0; i < length; i++) {
			answer[i] = num_list[i*n];
		}
        return answer;
    }
}