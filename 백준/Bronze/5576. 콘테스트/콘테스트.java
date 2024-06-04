
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] W = new int[10];
		int[] K = new int[10];

		for (int i = 0; i < 10; i++) {
			W[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 10; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}


		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				if (W[i] > W[j]) {
					int temp = W[i];
					W[i] = W[j];
					W[j] = temp;
				}
				if (K[i] > K[j]) {
					int temp = K[i];
					K[i] = K[j];
					K[j] = temp;
				}
			}
		}

		int KScore = 0;
		int WScore = 0;

		for (int i = 0; i < 3; i++) {
			WScore += W[10 - i - 1];
			KScore += K[10 - i - 1];

		}

		System.out.println(WScore + " " + KScore);

		bw.flush();
		bw.close();
	}
}