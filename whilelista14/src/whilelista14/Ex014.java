package whilelista14;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 2;
		
		System.out.print("Digite um número: ");
		int n = scanner.nextInt();
		
		while (i < n) {
			if (n % i == 0) {
				System.out.println("Não é primo.");
				break;
			}
			i++;	
		}
	
		if (i == n) {
		System.out.println("É PRIMO.");
		}
	
	}

}
