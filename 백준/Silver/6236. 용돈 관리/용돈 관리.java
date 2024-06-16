import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		int end = 0;
		int start = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			end += arr[i];
			start = Math.max(start, arr[i]);
		}


		while (start <= end) {
			int count = 1;
			int mid = (start + end) / 2;
			int money = mid;
			for (int num : arr) {
				money -= num;

				if (money < 0) {
					count++;
					money = mid - num;
				}
			}
			if (m >= count) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(result);
	}
}