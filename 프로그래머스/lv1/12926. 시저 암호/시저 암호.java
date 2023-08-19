import java.util.Arrays;

class Solution {
	public String solution(String s, int n) {
		String answer = "";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";

		String[] upperList = upper.split("");
		String[] lowerList = lower.split("");

		String[] str = s.split("");

		for (int i = 0; i < str.length; i++) {
			if (upper.contains(str[i])) {  // 대문자인 경우
				for (int j = 0; j < upperList.length; j++) {
					if (str[i].equals(upperList[j]) && (j + n) <= 25) { // 범위를 벗어나지 않는 경우
						str[i] = upperList[j + n];
						break;
					} else if (str[i].equals(upperList[j]) && (j + n) > 25) {
						str[i] = upperList[j + n - 26];
						break;
					}
				}
			} else if (lower.contains(str[i])) {
				for (int j = 0; j < lowerList.length; j++) {
					if (str[i].equals(lowerList[j]) && (j + n) <= 25) { // 범위를 벗어나지 않는 경우
						str[i] = lowerList[j + n];
						break;
					} else if (str[i].equals(lowerList[j]) && (j + n) > 25) {
						str[i] = lowerList[j + n - 26];
						break;
					}
				}
			}
		}
        
        for (String e : str) {
			answer += e;
		}


		return answer;
	}
}