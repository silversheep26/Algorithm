import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();

	}
}
