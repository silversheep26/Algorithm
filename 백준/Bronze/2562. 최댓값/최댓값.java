import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxNum = 0;
		int maxCnt = 0;

		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num > maxNum) {
				maxNum = num;
				maxCnt = i + 1;
			}
		}

		System.out.println(maxNum);
		System.out.println(maxCnt);
	}
}