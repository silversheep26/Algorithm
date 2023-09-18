import java.util.*;

class Solution {
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		int count = score.length / m;
		Integer[] integers = new Integer[score.length];
		for (int i = 0; i < score.length; i++) {
			integers[i] = score[i];
		}

		Arrays.sort(integers, Collections.reverseOrder());

       for(int i = m - 1 ;  i < integers.length ; i+= m){
            answer += (integers[i] * m);
        }
        return answer;
	}
}