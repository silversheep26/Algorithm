import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int cnt = 1;
			int people = Integer.parseInt(br.readLine());
			int[] arr = new int[people];
			for (int j = 0; j < people; j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				int ranking = Integer.parseInt(str.nextToken());
				arr[ranking - 1] = Integer.parseInt(str.nextToken());
			}

			int c = arr[0];
			for (int j = 0; j < people; j++) {
				if (c > arr[j]) {
					cnt++;
					c = arr[j];
				}
			}
			System.out.println(cnt);
		}
	}
}

