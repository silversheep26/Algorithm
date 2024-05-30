import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();

		int answer = 0;
		for (int i = 0; i <= Integer.parseInt(s); i++) {
			if (i < 100) {
				answer = i;
			} else if (i == 1000) {
				break;
			} else {
				String[] str = (i + "").split("");
				if (Integer.parseInt(str[0]) - Integer.parseInt(str[1])
					== Integer.parseInt(str[1]) - Integer.parseInt(str[2])) {
					answer++;
				}
			}
		}
				bw.write(answer + "");

		bw.flush();
		bw.close();
	}
}