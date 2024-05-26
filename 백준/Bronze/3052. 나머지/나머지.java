import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> numList = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			numList.add(num % 42);
			int re = num % 42;

			map.put(re, 1);
		}
		bw.write(map.size() + "");

		bw.flush();
		bw.close();

	}

}