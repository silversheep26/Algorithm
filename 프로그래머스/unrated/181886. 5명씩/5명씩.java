class Solution {
    public String[] solution(String[] names) {
		int namesLength = 0;
		if (names.length%5 == 0) {
			namesLength = names.length/5;
		} else {namesLength = names.length/5 + 1;}
		String[] answer = new String[namesLength];
		for (int i = 0; i <= namesLength-1; i++) {
			answer[i] = names[i*5];
		}
        return answer;
    }
}