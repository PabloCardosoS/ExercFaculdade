package whilelista11;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaPar = 0;
		int somaImpar = 0;

		System.out.print("Digite o primeiro número: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = scanner.nextInt();
		
		int menorNum = Math.min(n1, n2);
		int maiorNum = Math.max(n1, n2);
		
		int i = menorNum;
		
		while (i <= maiorNum) {
			if (i % 2 == 0) {
				somaPar += i;
			} else {
				somaImpar += i;
			}
			i += 1;
			
		} 
		
		System.out.println("A soma dos valores pares entre " + menorNum + " e " + maiorNum + " é: " + somaPar);
		System.out.println("A soma dos valores impares entre " + menorNum + " e " + maiorNum + " é: " + somaImpar);
		scanner.close();
	}

}
