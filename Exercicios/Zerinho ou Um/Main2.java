package maisPraTi;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
 
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		Object a, b, c;

		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();

			if (!a.equals(b) && !a.equals(c)) {
				System.out.println("A");
			} else if (!b.equals(a) && !b.equals(c)) {
				System.out.println("B");
			} else if (!c.equals(a) && !c.equals(b)) {
				System.out.println("C");
			} else {
				System.out.println("*");
			}
		}
		scan.close();
	}
	
}
