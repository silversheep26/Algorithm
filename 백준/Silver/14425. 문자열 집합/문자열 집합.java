import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] arrN = new String[n];
		String[] arrM = new String[m];

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			arrN[i] = br.readLine();
		}
		for (int i = 0; i < m; i++) {
			arrM[i] = br.readLine();
			for (int j = 0; j < n; j++) {
				if (arrN[j].equals(arrM[i])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}