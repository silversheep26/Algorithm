import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();

		int num = (Integer.parseInt(s1) + Integer.parseInt(s2) - Integer.parseInt(s3));
		String a = (Integer.parseInt(s1 + s2) - Integer.parseInt(s3)) +"";
		System.out.println(num);
		System.out.println(a);
	}
}