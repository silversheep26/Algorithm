import java.util.Arrays;

class Solution {
	public int solution(int[][] sizes) {
		int[] wList = new int[sizes.length];
		int[] hList = new int[sizes.length];

		for (int i = 0; i < sizes.length; i++) {
			wList[i] = Math.max(sizes[i][0], sizes[i][1]);
			hList[i] = Math.min(sizes[i][0], sizes[i][1]);
		}

		Arrays.sort(wList);
		Arrays.sort(hList);
		int w = wList[wList.length - 1];
		int h = hList[hList.length - 1];

		int answer = w * h;
		return answer;
	}
}