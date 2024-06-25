import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arrN = new int[n];
		int[] arrM = new int[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}

		int a = 0, b =0;
		StringBuilder sb = new StringBuilder();
		while (a < n && b < m) {
			if (arrN[a] < arrM[b]) {
				sb.append(arrN[a++]).append(" ");
			} else {
				sb.append(arrM[b++]).append(" ");
			}
		}

		while (a < n) {
			sb.append(arrN[a++]).append(" ");
		}
		while (b < m) {
			sb.append(arrM[b++]).append(" ");
		}

		System.out.println(sb);
	}
}