import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int numberM = scanner.nextInt();

		if (numberM == 1 || numberM == 2) {
			System.out.println("NEWBIE!");
		} else if (numberN >= numberM) {
			System.out.println("OLDBIE!");
		} else {
			System.out.println("TLE!");
		}
	}

}