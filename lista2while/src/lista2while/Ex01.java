package lista2while;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		do {
			System.out.print("Digite o " + (i + 1) + "º número aleatório: ");
			int n = scanner.nextInt();	
			if (n < 0) {
				System.out.println("Número negativo.\n");
			} else if (n == 0) {
				System.out.println("ZERO!!!\n");
			} else {
				System.out.println("O número é positivo. Ele é: " + n + "\n");
			}
			i++;
		} while (i < 10);	
		System.out.println("Foram digitados 10 números alteatórios.");
	
	}

}
