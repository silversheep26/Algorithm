import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long num = Long.parseLong(br.readLine());

		long left = 0;
		long right = num;
		long answer = 0;

		long n;

		while (left < right) {
			n = (left + right) / 2;

			if (Math.pow(n, 2) >= num) {
				answer = n;
				right = n;
			} else {
				left = n + 1;
			}
		}
		if (num == 1) answer = 1;
		System.out.println(answer);
	}
}