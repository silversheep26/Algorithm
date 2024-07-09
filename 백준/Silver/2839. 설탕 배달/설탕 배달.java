import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];

		if (n <= 7) {
			if (n == 3 || n == 5) {
				System.out.println(1);
			} else if (n == 6) {
				System.out.println(2);
			} else {
				System.out.println(-1);
			}
		} else {
			arr[3] = 1;
			arr[5] = 1;
			arr[6] = 2;
			for (int i = 8; i < arr.length; i++) {
				if (i % 5 == 0) {
					arr[i] = arr[i - 5] + 1;
				} else if (i % 3 == 0) {
					arr[i] = arr[i - 3] + 1;
				} else {
					if (arr[i - 3] != 0 && arr[i - 5] != 0) {
						arr[i] = Math.min(arr[i - 3], arr[i - 5]) + 1;
					}
				}
			}
			System.out.println(arr[n]);
		}
	}
}