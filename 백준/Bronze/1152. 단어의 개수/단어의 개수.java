import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int t = 0;
		for (String value : s) {
			if (!value.equals("")) {
				t++;
			}
		}

		System.out.println(t);

	}

}