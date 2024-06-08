import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double[] arr = new double[Integer.parseInt(br.readLine())];
		String[] st = br.readLine().split(" ");
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st[i]);
			max = Math.max(arr[i], max);
		}

		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] / max) * 100;
			avg += arr[i];
		}
		System.out.println(avg/arr.length);

	}
}