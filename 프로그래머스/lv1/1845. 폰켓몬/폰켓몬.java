import java.util.*;

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], 1);
		}

		if (hashMap.size() > nums.length/2 ) {
			answer = nums.length/2 ;
		} else {
			answer = hashMap.size();
		}
		return answer;
	}
}
