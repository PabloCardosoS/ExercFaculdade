package sem3ex010;

import java.util.Scanner;
import java.lang.String;

public class Ex010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = scanner.next().toLowerCase().charAt(0);
				
		switch (letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("É vogal!");
				break;
			default:
				System.out.println("Não é vogal.");
		}
	}
}
