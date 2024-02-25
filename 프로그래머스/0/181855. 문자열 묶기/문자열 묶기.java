class Solution {
	public int solution(String[] strArr) {
		int answer = 0;

		int[] intArr = new int[30];
		for(int i = 0; i < strArr.length; i++) {
			intArr[strArr[i].length()-1]++;
		}

		for(int num : intArr) {
			if(answer < num) answer = num;
		}
		return answer;
	}
}