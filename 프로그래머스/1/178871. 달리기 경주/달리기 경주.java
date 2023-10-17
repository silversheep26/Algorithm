import java.util.*;

class Solution {
	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];

		Map<Integer, String> map = new TreeMap<>();
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			map.put(i + 1, players[i]);
			hashMap.put(players[i], i + 1);
		}

		for (int i = 0; i < callings.length; i++) {
			String called = callings[i];
			int idx = hashMap.get(called);

			String back = map.get(idx - 1);

			hashMap.put(called, idx - 1);
			hashMap.put(back, idx);

			map.put(idx - 1, called);
			map.put(idx, back);
		}


		int idx = 0;
		for(int key:map.keySet()){
			answer[idx++]=map.get(key);
		}

		return answer;
	}
}
