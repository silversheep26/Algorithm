import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			int answer = (str.charAt(0) == 'O')? 1 : 0;
			int cnt = (str.charAt(0) == 'O')? 1 : 0;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					cnt++;
					answer += cnt;
				} else {
					cnt = 0;
				}
			}
			bw.write(answer + "" + "\n");
		}

		bw.flush();
		bw.close();

	}

}