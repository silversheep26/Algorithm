import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		//입력 보드
		String[] arr = new String[n];

		//흰보드와 검은보드
		String[] wBoard = new String[8];
		String[] bBoard = new String[8];

		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		//흰
		for(int i = 0; i < 8; i++) {
			if(i % 2 == 0) wBoard[i] = "WBWBWBWB";
			else wBoard[i] = "BWBWBWBW";
		}

		//검
		for(int i = 0; i < 8; i++) {
			if(i % 2 == 0) bBoard[i] = "BWBWBWBW";
			else bBoard[i] = "WBWBWBWB";
		}

		int min = 64;

		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int wCnt = 0;
				int bCnt = 0;
				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						if (wBoard[k].charAt(l) != arr[k + i].charAt(l + j)) wCnt++;
						if (bBoard[k].charAt(l) != arr[k + i].charAt(l + j)) bCnt++;
					}
				}
				min = Math.min(min, Math.min(wCnt, bCnt));
			}
		}
		System.out.println(min);
	}
}