import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String[] nums = br.readLine().split(" ");
		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			numList.add(Integer.parseInt(nums[i]));
		}

		Collections.sort(numList);
		String s = (numList.get(0) + "") + " " + (numList.get(numList.size() - 1) + "");
		bw.write(s);
		bw.flush();
		bw.close();

	}

}