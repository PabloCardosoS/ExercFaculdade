package whilelista5;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		int num = 0;
		while (i < 10) {
			System.out.print("Escreva o time: ");
			String time = scanner.nextLine();
			i++;
			if (time.equals("gremio")) {
				num = num + 1;
			}
		}
		System.out.println(num);
	}

}
