import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sg = Integer.parseInt(st.nextToken());
			int sy = Integer.parseInt(st.nextToken());
			if (sg == 0 && sy == 0) {
				break;
			}

			int s = 0;
			int e = 0;
			int cnt = 0;

			int[] arrG = new int[sg];
			int[] arrY = new int[sy];

			for (int i = 0; i < sg; i++) {
				arrG[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < sy; i++) {
				arrY[i] = Integer.parseInt(br.readLine());
			}

			while (s != sg && e != sy) {
				if (arrG[s] == arrY[e]) {
					cnt++;
					s++;
					e++;
				} else if (arrG[s] < arrY[e]) {
					s++;
				} else {
					e++;
				}
			}
			System.out.println(cnt);
		}
	}
}
