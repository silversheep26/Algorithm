import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		ArrayList<String> str = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			str.add(s.substring(i));
		}

		Collections.sort(str);
		for (String element : str) {
			bw.write(element + "\n");
		}
		bw.flush();
		bw.close();

	}
}
