import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			String s = "";

			for (int k = 0; k < str[1].length(); k++) {
				for (int j = 0; j < n; j++) {
					s += str[1].charAt(k);
				}
			}
			System.out.println(s);
		}


	}
}