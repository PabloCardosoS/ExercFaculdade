package sem3ex001;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int a = scanner.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("É PAR");
		} else {
			System.out.println("É IMPAR");
		}

	}

}
