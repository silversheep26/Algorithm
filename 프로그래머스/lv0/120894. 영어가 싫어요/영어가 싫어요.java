import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	public long solution(String numbers) {
		long answer = 0;
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine"};
		long[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		ArrayList<String> stringArrayList = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			if (numbers.contains(num[i])) {
				stringArrayList.add(num[i]);
			}
		}

		HashMap<String, Long> hashMap = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			hashMap.put(num[i], number[i]);
		}

		for (int i = 0; i < stringArrayList.size(); i++) {
			numbers = numbers.replace(stringArrayList.get(i), hashMap.get(stringArrayList.get(i)).longValue() + "");
		}
		answer = Long.parseLong(numbers);
		return answer;
	}
}