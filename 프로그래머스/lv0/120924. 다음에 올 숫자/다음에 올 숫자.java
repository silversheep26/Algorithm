class Solution {
	public int solution(int[] common) {
		int answer = 0;
		int differ = common[1] - common[0];
		int differ1 = common[2]-common[1];
		if (differ1 == differ) {
			answer = common[common.length - 1] + differ;
		} else {
			answer = common[common.length - 1] * (common[1]/common[0]);
		} 
		return answer;
	}
}