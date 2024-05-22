import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int c = Integer.parseInt(br.readLine());

		String s = "";
		int cnt = c;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (j < cnt - 1) {
					s += " ";
				} else {
					s += "*";
				}
			}
			cnt--;
//			System.out.println(s);
			bw.write(s + '\n');
			s = "";
		}



		bw.flush();
		bw.close();
	}

}