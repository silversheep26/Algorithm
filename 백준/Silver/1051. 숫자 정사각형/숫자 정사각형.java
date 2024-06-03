import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] rectangle = new int[n][m];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				rectangle[i][j] = str.charAt(j) - '0';
			}
		}

		int size = Math.min(n, m);
		int answer = 1;

		while (size > 1) {
			for (int i = 0; i <= n - size; i++) {
				for (int j = 0; j <= m - size; j++) {
					int zero = rectangle[i][j];
					int first = rectangle[i][j + size - 1];
					int second = rectangle[i + size - 1][j];
					int third = rectangle[i + size - 1][j + size - 1];
					if (zero == first && zero == second && zero == third) {
						answer = Math.max(answer, size * size);
					}
				}
			}
			size--;
		}

		System.out.println(answer);
	}
}

