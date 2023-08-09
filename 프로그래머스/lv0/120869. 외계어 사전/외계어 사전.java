import java.util.Arrays;

class Solution {
	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		for (int i = 0; i < dic.length; i++) {
			String[] dicI = dic[i].split("");
			if (dicI.length == spell.length) {
				Arrays.sort(spell);
				Arrays.sort(dicI);
				if (Arrays.equals(dicI, spell)) {
					answer = 1;
					break;
				}
			}
		}
		return answer;
	}
}