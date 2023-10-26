import java.util.*;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		Map<String, HashSet<String>> reportedIds = new HashMap<>();
		int[] mailCnt = new int[id_list.length];

		Map<String, Integer> idxId = new HashMap<>();
		for (int i = 0; i < id_list.length; i++) {
			idxId.put(id_list[i], i);
		}

		for (int i = 0; i < report.length; i++) {
			String[] reported = report[i].split(" ");
			if (reportedIds.get(reported[1]) == null) {
				reportedIds.put(reported[1], new HashSet<String>());
			}
			HashSet<String> set = reportedIds.get(reported[1]);
			set.add(reported[0]);
			reportedIds.put(reported[1], set);
		}

		for (int i = 0; i < id_list.length; i++) {
			Set<String> reportIds = reportedIds.get(id_list[i]);
			if (reportIds != null && reportIds.size() >= k) {
				Iterator<String> iterator = reportIds.iterator();
				while (iterator.hasNext()) {
					String reporter = iterator.next();
					mailCnt[idxId.get(reporter)]++;
				}
			}
		}

		answer = mailCnt;
		return answer;
	}
}