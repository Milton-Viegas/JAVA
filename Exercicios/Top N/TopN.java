package maisPraTi;

import java.io.IOException;
import java.util.Scanner;

public class TopN {

	public static void main(String[] args) throws IOException {

		try (Scanner scan = new Scanner(System.in)) {
			int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

			int K;

			K = scan.nextInt();
			if (TOPS[0] == K) {
				System.out.println("Top 1");
			}

			else if (TOPS[1] >= K) {
				System.out.println("Top 3");
			}

			else if (TOPS[2] >= K) {
				System.out.println("Top 5");
			} else if (TOPS[3] >= K) {
				System.out.println("Top 10");
			} else if (TOPS[4] >= K) {
				System.out.println("Top 25");
			} else if (TOPS[5] >= K) {
				System.out.println("Top 50");
			} else {
				System.out.println("Top 100");
			}
		}
	}
}
