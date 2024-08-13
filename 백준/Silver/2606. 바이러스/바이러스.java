import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	static boolean[] check;
	static int[][] arr;
	static int m;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());

		arr = new int[m + 1][m + 1];
		check = new boolean[m + 1];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int mm = Integer.parseInt(st.nextToken());
			int nn = Integer.parseInt(st.nextToken());
			arr[mm][nn] = arr[nn][mm] = 1;
		}

		dfs(1);
		System.out.println(count - 1);

	}

	public static void dfs(int start) {
		check[start] = true;
		count++;

		for (int i = 0; i <= m; i++) {
			if (arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
}