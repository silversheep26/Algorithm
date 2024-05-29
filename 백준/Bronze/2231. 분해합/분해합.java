import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int answer = 0;

		for (int i = 1; i <= a; i++) {
			int num = i;
			int sum = i;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum == a) {
				answer = i;
				break;
			}
		}

		bw.write(answer + "");
		bw.flush();
		bw.close();

	}

}