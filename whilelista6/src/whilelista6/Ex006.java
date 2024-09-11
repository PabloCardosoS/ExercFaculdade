package whilelista6;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		int i = 0;
		String conc = "";
		while (i < 5) {
			System.out.print("Digite o " + (i + 1) + "° número real: ");
			String n = Double.toString(scanner.nextDouble());
			conc += n + "   ";
			i++;
		}
		System.out.println(conc);

	}

}
