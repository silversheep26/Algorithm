import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		long original = (100 * y) / x;

		long left = 0;
		long right = x;
		long answer = -1;

		if (original > 99) {
			System.out.println(answer);
		} else {
			while (left <= right) {
				long mid = (left + right) / 2;
				long newZ = 100 * (y + mid) / (x + mid);
				if (original < newZ) {
					answer = mid;
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			System.out.println(answer);
		}
	}
}