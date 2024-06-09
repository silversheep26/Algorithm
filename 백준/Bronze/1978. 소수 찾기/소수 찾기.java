import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int answer = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 1; j < arr[i] + 1; j++) {
				if (arr[i] % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				answer++;
			}
		}
		System.out.println(answer);

	}
}
