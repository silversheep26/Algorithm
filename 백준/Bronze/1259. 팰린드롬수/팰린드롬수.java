import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] s = br.readLine().split("");
			if (s[0].equals("0")) {
				break;
			}
			String st = "";
			String stReverse = "";
			for (int i = 0; i < s.length; i++) {
				st += s[i];
				stReverse += s[s.length - i - 1];
			}
			if (st.equals(stReverse)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}
}
