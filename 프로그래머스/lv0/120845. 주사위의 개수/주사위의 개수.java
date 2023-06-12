class Solution {
    public int solution(int[] box, int n) {
		int answer = 1;
		int[] count = new int[3];
		for (int i = 0; i < count.length; i++) {
			count[i] = box[i]/n;
			answer *= count[i];
		}
        return answer;
    }
}