package sem3ex007;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		System.out.println("-----------------CALCULADORA----------------------");
		System.out.println("Digite 1 para somar dois valores");
		System.out.println("Digite 2 para subtrair dois valores");
		System.out.println("Digite 3 para multiplicar dois valores");
		System.out.println("Digite 4 para dividir dois valores");
		System.out.println("Digite 5 para realizar uma potência entre dois valores");
		System.out.println("Digite 6 para realizar uma radiciação entre dois valores");
		System.out.println("Digite qualquer número para sair");
		System.out.println("--------------------------------------------------");
		System.out.print("Favor, digite um número conforme solicitado acima: ");
		int num = scanner.nextInt();
		if (num >= 1 && num <= 6) {
			System.out.print("Digite o primeiro número: ");
			double a = scanner.nextDouble();
			System.out.print("Digite o segundo número: ");
			double b = scanner.nextDouble();
			double c;
			switch (num) {
			case 1:
				c = a + b;
				System.out.println("A soma é " + c);
				break;
			case 2:
				c = a - b;
				System.out.println("A subtração é " + c);
				break;
			case 3:
				c = a * b;
				System.out.println("A multiplicação é " + c);
				break;
			case 4:
				c = a / b;
				System.out.println("A divisão é " + c);
				break;
			case 5:
				c = Math.pow(a, b);
				System.out.println("A potenciação é " + c);
				break;
			case 6:
				c = Math.pow(a, 1/b);
				System.out.println("A radiciação é "+ c);
				break;
			}
			
		} else {
			System.out.println("SAINDO DO PROGRAMA!!!!");
		}
		
	}

}
