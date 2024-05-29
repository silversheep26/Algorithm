import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		int num = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			num += arr[i];
		}

		Loop1 : for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				int c = num - (arr[i] + arr[j]);
				if (c == 100) {
					arr[i] = -1;
					arr[j] = -1;
					break Loop1;
				}
			}
		}
		Arrays.sort(arr);

		for (int j : arr) {
			if (j != -1) {
				bw.write(j + "" + "\n");
			}
		}
		bw.flush();
		bw.close();

	}
}
