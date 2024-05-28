import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i) - 97;
			if (arr[a] == -1) {
				arr[a] = i;
			}
		}

		str = arr[0] + "";
		for (int i = 1; i < arr.length; i++) {
			str += " " + arr[i] + "";
		}
		bw.write(str);
		bw.flush();
		bw.close();

	}
}
