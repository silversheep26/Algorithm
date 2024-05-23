import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int multi = a * b * c;
		while (multi != 0) {
			int cnt = multi%10;
			arr[cnt]++;
			multi /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] +"");
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
