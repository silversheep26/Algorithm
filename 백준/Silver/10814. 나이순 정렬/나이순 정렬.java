import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] member = new String[201];

		for (int i = 0; i < member.length; i++) {
			member[i] = "";
		}

		for (int i = 0; i < N; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(str.nextToken());
			member[age] += age + " " + str.nextToken() + "\n";
		}

		String answer = "";
		for (int i = 0; i < member.length; i++) {
			answer += member[i];
		}
		bw.write(answer);

		bw.flush();
		bw.close();
	}
}