package whilelista13;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();
		int fatorial = 1;
		if (n > 0) {
			while (n > 0) {
				fatorial *= n;
				n--;
			}
			System.out.println(fatorial);
		} else {
			System.out.println("ERRO!\nValor deve ser positivo.");
		}
		
	}

}
