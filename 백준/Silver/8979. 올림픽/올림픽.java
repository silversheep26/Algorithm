import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int country = Integer.parseInt(st.nextToken());
		int rank = Integer.parseInt(st.nextToken());
		int ranking = 1;

		int[][] arr = new int[country+1][3];

		for (int i = 1; i <= country; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			arr[num][0] = Integer.parseInt(st.nextToken());
			arr[num][1] = Integer.parseInt(st.nextToken());
			arr[num][2] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= country; i++) {
			if (arr[i][0] > arr[rank][0]) {
				ranking++;
			} else if (arr[i][0] == arr[rank][0] && arr[i][1] > arr[rank][1]) {
				ranking++;
			} else if (arr[i][0] == arr[rank][0] && arr[i][1] == arr[rank][1]
				&& arr[i][2] > arr[rank][2]) {
				ranking++;
			}
		}
		System.out.println(ranking);

	}
}
