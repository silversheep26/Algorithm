import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int a = 1;
		int b = a + 1;
		int sum = a;
		int cnt = 1;

		while (a < N) {
			if (sum < N) {
				sum += b;
				b++;
			} else if (sum > N) {
				a++;
				sum = a;
				b = a + 1;
			} else {
				cnt++;
				a++;
				sum = a;
				b = a + 1;
			}
		}
		System.out.println(cnt);
	}
}
