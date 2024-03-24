import java.util.Scanner;

public class Programmers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";
		char[] c = a.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (97 <= c[i] && c[i] <= 122) {
				answer += (c[i] + "").toUpperCase();
			} else if (65 <= c[i] && c[i] <= 90) {
				answer += (c[i] + "").toLowerCase();
			}
		}

		System.out.println(answer);
	}
}