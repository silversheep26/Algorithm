import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int arr[][];
	static boolean[] check;

	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][N + 1];
		check = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (!check[i]) {
				dfs(i);
				count++;
			}
		}

		System.out.println(count);

	}

	public static void dfs(int x) {
		check[x] = true;
		for (int i = 0; i <= N; i++) {
			if (arr[x][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
}