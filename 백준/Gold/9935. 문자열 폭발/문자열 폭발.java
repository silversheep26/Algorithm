import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();
		String explore = br.readLine();

		Stack<Character> st = new Stack<>();

			for (int i = 0; i < s.length(); i++) {
				st.push(s.charAt(i));
				if (st.size() >= explore.length()) {
					boolean b = true;
					for (int j = 0; j < explore.length(); j++) {
						if (st.get(st.size() - explore.length() + j) != explore.charAt(j)) {
							b = !b;
							break;
						}
					}
					if (b) {
						for (int j = 0; j < explore.length(); j++) {
							st.pop();
						}
					}
				}
			}
			for (char hey : st) {
				sb.append(hey);
			}
			System.out.println(sb.toString().length() == 0 ? "FRULA" : sb);
		}
}