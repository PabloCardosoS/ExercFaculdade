package whilelista12;

import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0; 
		double media = 0;
		int c = 1;
	
		while (true) {
	
			System.out.println("Digite um número positivo: ");
			double n = scanner.nextDouble();
			
			if (n < 0) {
				System.out.println(media);
				break;
			}
			
			soma += n;
			media = soma / c;
			c++;
		} 
			
		
	}
	
}
