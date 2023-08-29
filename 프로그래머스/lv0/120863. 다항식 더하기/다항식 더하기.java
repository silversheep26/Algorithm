class Solution {
	public String solution(String polynomial) {
		String answer = "";
		String[] poly = polynomial.split(" ");

		int num = 0;
		int constants = 0;

		for (int i = 0; i < poly.length; i++) {
			if (poly[i].contains("x")) {
				String[] p = poly[i].split("x");
				if (p.length == 0) {
					num += 1;
				} else {
					num += Integer.parseInt(p[0]);
				}
			} else if (!poly[i].equals("+")) {
				constants += Integer.parseInt(poly[i]);
			}
		}

		if (num == 0) {
			answer = constants + "";
		} else if (constants == 0) {
			if (num == 1) {
				answer = "x";
			} else answer = (num + "") + "x";
		} else {
			if (num == 1) {
				answer =  "x" + " + " + constants + "";
			} else answer = (num + "") + "x" + " + " + constants + "";
		}
		System.out.println(num);
		System.out.println(answer);
		return answer;
	}
}