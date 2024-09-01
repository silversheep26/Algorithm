import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cards = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= cards; i++) {
			queue.add(i);
		}

		StringBuilder str = new StringBuilder();
		while (queue.size() > 1) {
			str.append(queue.peek()).append(" ");
			queue.poll();
			queue.add(queue.poll());
		}

		str.append(queue.peek());
		System.out.println(str);

	}
}

