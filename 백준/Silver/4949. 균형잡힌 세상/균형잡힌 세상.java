import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Loop1 : while (true) {
			String s = br.readLine();

			if (s.equals(".")) {
				break;
			}

			Stack<Character> st = new Stack<>();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '[') {
					st.push(c);
				} else if (c == ')') {
					if (st.empty() || st.peek() != '(') {
						System.out.println("no");
						continue Loop1;
					} else {
						st.pop();
					}
				} else if (c == ']') {
					if (st.empty() || st.peek() != '[') {
						System.out.println("no");
						continue Loop1;
					} else {
						st.pop();
					}
				}
			}
			if (st.empty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}