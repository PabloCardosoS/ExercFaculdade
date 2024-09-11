package lista2while06;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		while (true) {
			System.out.print("Digite um número positivo e par: ");
			int posPar = scanner.nextInt();
			
			if (posPar > 0 && posPar % 2 == 0) {
				soma += posPar;
			} else {
				System.out.println("A soma dos positivos e pares é de: " + soma);
				break;
			}
	
		}

				
		

	}

}
