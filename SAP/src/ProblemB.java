import java.util.Scanner;

public class ProblemB {

	public static void main(String args[]) {

		Scanner stdin = new Scanner(System.in);
		int count = 1;
		String data = stdin.next();

		while (data != "END") {
			int sum = 0;

			for (int i = 0; i < data.length(); i++) {
				if (data.charAt(i) == '.') {
					sum = sum + 1;

				}
			}

			if (sum % 2 == 0) {
				System.out.println(count + " EVEN");
			}

			else {
				System.out.println(count + " NOT EVEN");
			}
			count++;

			data = stdin.next();

		}

	}

}
