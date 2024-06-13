import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		StringTokenizer stN = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(stN.nextToken());
		}

		Arrays.sort(arrN);

		int m = Integer.parseInt(br.readLine());
		StringTokenizer stM = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			boolean check = false;
			int left = 0;
			int right = arrN.length - 1;
			int t = Integer.parseInt(stM.nextToken());
			while (left <= right) {
				int mid = (left + right)/2;
				if (arrN[mid] > t) {
					right = mid - 1;
				} else if (arrN[mid] < t) {
					left = mid + 1;
				} else {
					check = true;
					break;
				}
			}
			if (check) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}