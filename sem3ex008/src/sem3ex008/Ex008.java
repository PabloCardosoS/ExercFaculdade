package sem3ex008;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um ano: ");
		int n = scanner.nextInt();
		if (n % 4 == 0) {
			int m;
			System.out.println("O ano é bissexto.");
		} else {
			System.out.println("O ano não é bissexto.");
		}
		
		

	}

}
