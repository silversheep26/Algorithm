class Solution {
	public int solution(int[] array) {
		int answer = 0;
		String[] strings = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			strings[i] = array[i] + "";
		}
		for (int i = 0; i < strings.length; i++) {
			String[] number = strings[i].split("");
			for (int j = 0; j < number.length; j++) {
				if (number[j].equals("7")) {
					answer += 1;
				}
			}
		}
		return answer;
	}
}