import java.io.IOException;
import java.util.Scanner;

public class ProblemA {

	// Function to calculate distance
	static double distance(double x1, double y1, double x2, double y2, double p) {

		// Calculating distance
		return Math.pow(Math.pow(x2 - x1, p) + Math.pow(y2 - y1, p), 1.0 / p);

	}

	// Driver code
	public static void main(String[] args) throws IOException {

		Scanner stdin = new Scanner(System.in);
		double n = stdin.nextDouble();
		while (n != 0) {
			double x1, y1, x2, y2, p;
			x1 = n;
			y1 = stdin.nextDouble();
			x2 = stdin.nextDouble();
			y2 = stdin.nextDouble();
			p = stdin.nextDouble();
			System.out.format("%.10f", distance(x1, y1, x2, y2, p));
			System.out.println();
			// Get Next Case Line
			n = stdin.nextDouble();

		}

		stdin.close();
	}

}
