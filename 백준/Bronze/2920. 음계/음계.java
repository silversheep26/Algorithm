import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		String s = "";
		for (int i = 0; i < str.length; i++) {
			s += str[i];
		}

		if (s.contains("12345678")) {
			bw.write("ascending");
		} else if (s.contains("87654321")) {
			bw.write("descending");
		} else {
			bw.write("mixed");
		}

		bw.flush();
		bw.close();

	}

}