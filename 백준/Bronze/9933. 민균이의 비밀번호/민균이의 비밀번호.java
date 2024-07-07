import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		HashMap<String, Integer> h = new HashMap<>();
		for (int i = 0; i < c; i++) {
			String s = br.readLine();
			h.put(s, h.getOrDefault(s, 0) + 1);
			String[] arr = s.split("");
			String sd = "";
			for (int j = arr.length -1; j >= 0; j--) {
				sd += arr[j];
			}
			h.put(sd, h.getOrDefault(sd, 0) + 1);

			if (h.get(s) > 1) {
				System.out.printf("%s %s", s.length(), s.charAt((s.length() / 2)));
				break;
			}
		}
	}
}